package com.ssl.springbootvue.model.DTO;

public class RestResult<T> {
    private boolean result;
    private String code;
    private String message;
    private T data;

    @Override
    public String toString() {
        return "RestResult{" +
                "result=" + result +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
