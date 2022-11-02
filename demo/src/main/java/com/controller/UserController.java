package com.controller;

import com.config.myextion.MusicException;
import com.dao.bean.User;
import com.dao.service.OperatorUserService;
import com.tools.GetId;
import com.tools.pp;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/10/28
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    OperatorUserService operatorUserService;


    /**
     * 登录
     * @param curData
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping("/login")
    public String insertUser(@RequestBody String curData, HttpServletResponse response) throws MusicException {
        Map<String, Object> curList = (Map<String, Object>) JSONObject.parse(curData);

        if (!curList.containsKey("userCount") || curList.get("userCount").equals("")){
            throw new MusicException("账号为空!");
        }
        if (!curList.containsKey("userPass") || curList.get("userPass").equals("")){
            throw new MusicException("密码为空!");
        }
        String userPass = operatorUserService.queryLoginUser((String) curList.get("userCount"));

        if (Objects.isNull(userPass)){
            throw new MusicException("用户不存在!");
        }
        if (!userPass.equals(curList.get("userPass"))){
            throw new MusicException("密码错误!");
        }
        return "登录成功!";
    }

    /**
     * 注册
     * @param curData
     * @param response
     * @return
     * @throws MusicException
     */
    @ResponseBody
    @RequestMapping("enroll")
    public String createUser(@RequestBody String curData , HttpServletResponse response) throws MusicException{
        Map<String, Object> curList = (Map<String, Object>) JSONObject.parse(curData);

        User curUser = new User();

        //非空属性判断
        if (!curList.containsKey("userCount") || curList.get("userCount").equals("")){
            throw new MusicException("账号不能为空!");
        }
        if (!curList.containsKey("userPass") || curList.get("userPass").equals("")){
            throw new MusicException("密码不能为空!");
        }
        if (!curList.containsKey("userName") || curList.get("userName").equals("")){
            throw new MusicException("昵称不能为空!");
        }

        //唯一性判断
        String curCount = (String) curList.get("userCount");
        //String curPass = (String) curList.get("userPass");
        String curName = (String) curList.get("userName");

        if (!operatorUserService.queryIsUser(curCount , "user_count")){
            throw new MusicException("用户已被注册!!!");
        }
        if (!operatorUserService.queryIsUser(curName , "user_name")){
            throw new MusicException("昵称已被占用,请修改!");
        }

        curUser.setUserCount(curCount);
        curUser.setUserName(curName);
        curUser.setUserPass((String) curList.get("userPass"));

        boolean b = operatorUserService.insertUser(curUser, pp.COMMON_PRE);
        if (!b){
            throw new MusicException("注册失败");
        }
        return "注册成功!";
    }


    /**
     * 退出登录
     * @param curData
     * @param response
     * @return
     * @throws MusicException
     */
    @ResponseBody
    @RequestMapping("/logout")
    public String logOut(@RequestBody String curData , HttpServletResponse response) throws MusicException{
        Map<String, Object> curList = (Map<String, Object>) JSONObject.parse(curData);

        return "";
    }

    /**
     * 注销用户
     * @param curData
     * @param response
     * @return
     * @throws MusicException
     */
    @ResponseBody
    @RequestMapping("/logout/delete")
    public String logOutUser(@RequestBody String curData , HttpServletResponse response) throws MusicException{
        Map<String, Object> curList = (Map<String, Object>) JSONObject.parse(curData);

        return "";
    }
}
