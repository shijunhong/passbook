package com.qianyan.passbook.merchants.constant;

/**
 * <h2>错误码枚举定义</h2>
 * Created by shijunhong
 */
public enum ErrorCode {
    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "商户名称重复"),
    EMPTY_LOGO(2, "商户 LOGO 为空"),
    EMPTY_BUSINESS_LICENSE(4, "商户营业执照为空"),
    ERROR_PHONE(5, "商户联系电话错误"),
    EMPTY_ADDRESS(5, "商户地址为空"),
    MERCHANTS_NOT_EXIST(6, "商户不存在");

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String desc;

    ErrorCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
