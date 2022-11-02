package com.dao.service;

import com.dao.bean.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/10/27
 * @Description:
 */
public interface OperatorUserService{

    /**
     *注册用户-注册即为普通用户
     */
    boolean insertUser(User test, String preString);

    /**
     * 注销用户-只有通过号主认证才能注销
     */
    void logoutUser(String id , boolean isOwner );

    /**
     * 删除用户-只有管理员可以删除普通用户
     */
    void deleteUser(String id , String OperatorId);

    /**
     * 修改个人资料
     */

    void updateUser(User test);

    /**
     * 注册唯一性验证
     * @param curKey
     * @param curData
     */
    boolean queryIsUser(String curData , String curKey);



    String queryLoginUser(String curCount);
}
