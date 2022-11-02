package com.config.myextion;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/1
 * @Description:
 */
@ControllerAdvice
public class MyException {


    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ExceptionEntity allException(Exception exception){
        ExceptionEntity<Object> curException = new ExceptionEntity<>();
        curException.setCode(ExceptionEntity.error);
        curException.setMessage(exception.getMessage());
        return curException;
    }



    @ResponseBody
    @ExceptionHandler(MusicException.class)
    public ExceptionEntity MusicException(MusicException musicException){
        ExceptionEntity<Object> curException = new ExceptionEntity<>();
        curException.setCode(ExceptionEntity.error);
        curException.setMessage(musicException.getMessage());
        return curException;
    }

}
