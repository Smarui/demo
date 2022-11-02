package com.dao.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.dao.bean.User;
import com.dao.mapper.TestMapper;
import com.dao.service.OperatorUserService;
import com.tools.GetId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/10/27
 * @Description:
 */
@Slf4j
@Service
public class OperatorUserImpl implements OperatorUserService {


    @Autowired
    TestMapper testMapper;

    @Override
    public boolean insertUser(User test, String preString) {

            String id = GetId.getId(preString);
            test.setId(id);
            test.setUserCode("1");
            //暂定
        test.setUserPro("1");
        test.setUserLove("1");
        test.setCreateTime(new Date(System.currentTimeMillis()));
        Integer insert = testMapper.insert(test);
        return insert==1;
    }

    /**
     * 注销用户-只有通过号主认证才能注销
     *
     * @param id
     * @param isOwner
     */
    @Override
    public void logoutUser(String id, boolean isOwner) {
        try {
            if (!isOwner){
                throw new RuntimeException("不是本人操作!!");
            }else {
                Wrapper wrapper = new EntityWrapper();
                wrapper.eq("id" , id);
                testMapper.delete(wrapper);
            }
        } catch (RuntimeException e) {
            log.info(e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * 删除用户-只有管理员可以删除普通用户
     *
     * @param id
     * @param OperatorId
     */
    @Override
    public void deleteUser(String id, String OperatorId) {
        try {
            if (!OperatorId.contains(GetId.ADMIN)){
                throw new RuntimeException("权限不足!!!");
            }else {
                Wrapper wrapper = new EntityWrapper();
                wrapper.eq("id" , id);
                testMapper.delete(wrapper);
            }
        } catch (RuntimeException e) {
            log.info(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 修改个人资料
     *
     * @param test
     */
    @Override
    public void updateUser(User test) {
        testMapper.updateById(test);
    }


    /**
     * 注册唯一性验证
     *
     * @param curData
     * @param curKey
     */
    @Override
    public boolean queryIsUser(String curData , String curKey) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(curKey, curData);
        List<User> res = testMapper.selectByMap(map);
        return res.size()==0;
    }


    /**
     * 登录验证
     * @param curCount
     * @return
     */
    @Override
    public String queryLoginUser(String curCount) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("user_count", curCount);
        List<User> res = testMapper.selectByMap(map);
        if (res.size()!=0) {
            return res.get(0).getUserPass();
        }
        return null;
    }


    /**
     * @param curID
     * @return
     */
    @Override
    public User selectById(String curID) {
        User user = testMapper.selectById(curID);
        if (Objects.isNull(user)) {
            return null;
        }
        return user;
    }
}
