package cn.anselyuki.common.error;

/**
 * @author AnselYuki
 * @date 2022/12/16 13:00
 **/
public enum SystemCodeEnum implements BaseError {
    //系统错误信息枚举
    PARAMETER_ERROR(50000, "参数不合法"),
    TOKEN_ERROR(50001, "用户未认证");

    /**
     * 错误码
     */
    private final int errorCode;

    /**
     * 错误描述
     */
    private String errorMsg;

    SystemCodeEnum(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Override
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
