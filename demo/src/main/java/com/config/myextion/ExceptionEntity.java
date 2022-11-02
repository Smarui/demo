package com.config.myextion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/2
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionEntity<T> {

    public final static String succeed = "200";
    public final static String error = "999";

    public String code;
    public String message;
    public T data;



}
