package com.dao.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/10/26
 * @Description:
 */
@Data
@TableName(value = "music_user")
public class User {


    @TableId(value = "id")//指定自增策略
    private String id;
    private String userCode;
    private String userName;
    private String userCount;
    private String userPass;
    private String userSex;
    private String userPro;
    private String userLove;
    private String userPhone;
    private String userEmail;
    private boolean isVip;
    private Date vipDate;
    private Date createTime;
    private String memo;
    private boolean dr;


}
