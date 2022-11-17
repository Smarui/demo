package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/2
 * @Description:
 */
@Controller
@RequestMapping("/music")
public class MusicController {

    /**
     * 获取所有音乐
     * 分页获取
     * 一页最大数 size
     * @return
     */
    @ResponseBody
    @RequestMapping("/all")
    public String getAllMusic(int size){
        return "";
    }
}
