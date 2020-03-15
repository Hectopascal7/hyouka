package cn.net.iscream.hyouka.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * ClassName : HyoukaServerResponse
 * Description : 高复用服务响应对象
 * Author : Jeanne d'Arc
 * Date : 2020-03-15 19:42
 */
public class HyoukaServerResponse<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private HyoukaServerResponse(int status) {
        this.status = status;
    }

    private HyoukaServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private HyoukaServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private HyoukaServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    @JsonIgnore
    //使之不在json序列化结果当中
    public boolean isSuccess() {
        return this.status == HyoukaResponseCodeConst.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    // 成功状态
    public static <T> HyoukaServerResponse<T> createBySuccess() {
        return new HyoukaServerResponse<T>(HyoukaResponseCodeConst.SUCCESS.getCode(), HyoukaResponseCodeConst.SUCCESS.getDesc());
    }

    public static <T> HyoukaServerResponse<T> createBySuccessMessage(String successMsg) {
        return new HyoukaServerResponse<T>(HyoukaResponseCodeConst.SUCCESS.getCode(), successMsg);
    }

    public static <T> HyoukaServerResponse<T> createBySuccess(T data) {
        return new HyoukaServerResponse<T>(HyoukaResponseCodeConst.SUCCESS.getCode(), data);
    }

    public static <T> HyoukaServerResponse<T> createBySuccess(String msg, T data) {
        return new HyoukaServerResponse<T>(HyoukaResponseCodeConst.SUCCESS.getCode(), msg, data);
    }

    // 失败状态
    public static <T> HyoukaServerResponse<T> createByError() {
        return new HyoukaServerResponse<T>(HyoukaResponseCodeConst.ERROR.getCode(), HyoukaResponseCodeConst.ERROR.getDesc());
    }

    public static <T> HyoukaServerResponse<T> createByErrorMessage(String errorMessage) {
        return new HyoukaServerResponse<T>(HyoukaResponseCodeConst.ERROR.getCode(), errorMessage);
    }

    public static <T> HyoukaServerResponse<T> createByErrorCodeMessage(int errorCode, String errorMessage) {
        return new HyoukaServerResponse<T>(errorCode, errorMessage);
    }

}
