package com.insandiden.manage.crm.core;

import java.io.Serializable;

/**
 * @author lixh
 * @date 2020-06-01 15:09
 */
public enum  ResultCode implements Serializable {
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAILED(404,"校验失败"),
    UNAUTHORIZED(401,"暂未登录或token已过期"),
    FORBIDDEN(403,"没有权限");
    private long code;
    private String message;

    private ResultCode(long code, String message){
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
