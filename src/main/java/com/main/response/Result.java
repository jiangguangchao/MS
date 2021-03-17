package com.main.response;

import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 封装返回前台数据
 * @author:jgc
 * @create:2021-03-17 09:26
 */
public class Result implements Serializable {
    private String code;
    private String message;
    private Map<String, Object> data = new HashMap<String, Object>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Result ok(Map<String, Object> data, String message) {
        Result r = new Result();
        r.setCode("00");
        r.setMessage("成功");
        if (StringUtils.hasText(message)) {
            r.setMessage(message);
        }

        if (data != null && !data.isEmpty()) {
            r.setData(data);
        }

        return r;
    }


    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
