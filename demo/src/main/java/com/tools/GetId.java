package com.tools;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/10/27
 * @Description:
 */
@Slf4j
public class GetId {

    public static final  String ADMIN = "ADMIN";
    public static final  String COMMON = "COMMON";

    public static String getId(String preString){
        String curPreString = null;
        if (preString.equals(ADMIN)){
            curPreString = ADMIN ;
        }
        if (preString.equals(COMMON)){
            curPreString = COMMON;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYYMMddHHmmss");
        String curSerial = simpleDateFormat.format(new Date());

        return curPreString+curSerial;
    }
}
