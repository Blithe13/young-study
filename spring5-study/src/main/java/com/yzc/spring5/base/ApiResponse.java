package com.yzc.spring5.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApiResponse<T> {
    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    public ApiResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResponse(T data) {
        this.code = 0;
        this.data = data;
        this.message = "成功";
    }

    public ApiResponse() {
        this.code = 0;
        this.message = "成功";
        this.data = null;
    }
}
