package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.common.myreturn.CommonReturn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/2
 * @Description: CrossOrgin , 允许请求跨域
 */
@Controller
@CrossOrigin
@RequestMapping("/music")
public class MusicController {

    /**
     * 获取所有音乐
     * 分页获取
     * 一页最大数 size
     * @return
     */
    @ResponseBody
    @PostMapping("/all")
    public String getAllMusic(@RequestBody String curData, HttpServletResponse response , HttpServletRequest request) throws IOException {
        File file = new File("G:/music/叶炫清 - 知晚.mp3");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = fileInputStream.readAllBytes();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("sss","sdsdds");

        String res = JSONObject.toJSONString(new CommonReturn(CommonReturn.succeed, "登录成功" ,"啊实打实大师大所大所多撒多撒多"));
        return res;
    }
}
