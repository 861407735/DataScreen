package com.sz.result;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回信息包装类
 * @author lyh
 * @date 2021-08-10
 */
public class Result<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(int code,String msg){
        this.code=code;
        this.msg=msg;
    }


    public static <T> Result<T> success(T data) {
        return new Result<>(200, "操作成功", data);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>(400, "操作失败");
    }
    public static <T> Result<T> fail() {
        return new Result<>(400, "操作失败",null);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return new Result<>(400, msg, null);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
