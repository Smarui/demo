package com.common.myreturn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author:wq
 * @Date: 2022/11/17
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonReturn<T> {
    public final static String succeed = "200";
    public final static String error = "999";

    public String code;
    public String message;
    public T data;


    public CommonReturn(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data
                ;
    }
}
