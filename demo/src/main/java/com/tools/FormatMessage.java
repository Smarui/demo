package com.tools;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/17
 * @Description:
 */
public class FormatMessage {

    public static Map<String ,Object> formatMessage(String cur){

//        int index = 1 ;
        Map<String ,Object> res = new HashMap<>();
        String[] curArr = cur.split("&");
        for(int i = 0 ; i < curArr.length ; i++){
            String curKey = curArr[i].substring(0 , curArr[i].indexOf("="));
            String curValue = curArr[i].substring(curArr[i].indexOf("=")+1);
            res.put(curKey,curValue);
        }
        return res;
    }
}
