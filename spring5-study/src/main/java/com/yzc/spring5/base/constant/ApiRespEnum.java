package com.yzc.spring5.base.constant;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ApiRespEnum {
    SUCCESS(0, "成功"),
    ERROR_NO_PARAMS(1001, "请求参数错误");


    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
