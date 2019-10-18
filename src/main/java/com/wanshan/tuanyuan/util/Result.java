package com.wanshan.tuanyuan.util;

public class Result<T> {

    private String returnCode = "200";

    private String returnMsg;

    private T returnData;

    private Long total = 0L;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public T getReturnData() {
        return returnData;
    }

    public void setReturnData(T returnData) {
        this.returnData = returnData;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Result() {
    }

    public Result(T returnData) {
        this.returnData = returnData;
    }
}
