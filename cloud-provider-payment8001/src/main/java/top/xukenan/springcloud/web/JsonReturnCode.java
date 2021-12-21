package top.xukenan.springcloud.web;

public enum JsonReturnCode {

    NOT_LOGIN(401, "未登录", false),
    SUCCESS(200, "成功", true),
    FAIL(500, "内部失败", false),
    FILEMAX(413, "文件太大", false),
    ACCESS_ERROR(403, "禁止访问", false),
    NOT_FOUND(404, "页面未发现", false);
    private Integer code;
    private String desc;
    private boolean success;

    JsonReturnCode(Integer code, String desc, boolean success) {
        this.code = code;
        this.desc = desc;
        this.success = success;
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

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
