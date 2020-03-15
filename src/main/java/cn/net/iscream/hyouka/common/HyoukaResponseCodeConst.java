package cn.net.iscream.hyouka.common;

/**
 * ClassName : HyoukaResponseCodeConst
 * Description : 响应状态码枚举类
 * Author : Jeanne d'Arc
 * Date : 2020-03-15 19:44
 */
public enum HyoukaResponseCodeConst {

    ERROR(0, "ERROR"),
    SUCCESS(1, "SUCCESS"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;


    HyoukaResponseCodeConst(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
