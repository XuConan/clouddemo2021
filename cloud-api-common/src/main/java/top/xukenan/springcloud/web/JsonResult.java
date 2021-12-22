package top.xukenan.springcloud.web;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class JsonResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public static <T> JsonResult<T> fail() {
        JsonResult<T> ret = new JsonResult<T>();
        ret.setCode(JsonReturnCode.FAIL.getCode());
        ret.setMsg(JsonReturnCode.FAIL.getDesc());
        return ret;
    }

    public static <T> JsonResult<T> notLogin() {
        JsonResult<T> ret = new JsonResult<T>();
        ret.setCode(JsonReturnCode.NOT_LOGIN.getCode());
        ret.setMsg(JsonReturnCode.NOT_LOGIN.getDesc());
        return ret;
    }

    public static <T> JsonResult<T> notLogin(String msg) {
        JsonResult<T> ret = new JsonResult<T>();
        ret.setCode(JsonReturnCode.NOT_LOGIN.getCode());
        ret.setMsg(msg);
        return ret;
    }

    public static <T> JsonResult<T> fail(T data) {
        JsonResult<T> ret = JsonResult.fail();
        ret.setData(data);
        return ret;
    }

    public static <T> JsonResult<T> failMessage(String msg) {
        JsonResult<T> ret = JsonResult.fail();
        ret.setMsg(msg);
        return ret;
    }

    public static <T> JsonResult<T> failMessage(String msg, T data) {
        JsonResult<T> ret = JsonResult.fail();
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }

    public static <T> JsonResult<T> successMessage(String msg) {
        JsonResult<T> ret = JsonResult.success();
        ret.setMsg(msg);
        return ret;
    }

    public static <T> JsonResult<T> success() {
        JsonResult<T> ret = new JsonResult<T>();
        ret.setCode(JsonReturnCode.SUCCESS.getCode());
        ret.setMsg(JsonReturnCode.SUCCESS.getDesc());
        return ret;
    }

    public static <T> JsonResult<T> success(T data) {
        JsonResult<T> ret = JsonResult.success();
        ret.setData(data);
        return ret;
    }

    public static <T> JsonResult<T> success(T data, Integer code) {
        JsonResult<T> ret = JsonResult.success();
        ret.setData(data);
        ret.setCode(code);
        return ret;
    }

    public static <T> JsonResult<T> http404(T data) {
        JsonResult<T> ret = new JsonResult<T>();
        ret.setCode(JsonReturnCode.NOT_FOUND.getCode());
        ret.setMsg(JsonReturnCode.NOT_FOUND.getDesc());
        ret.setData(data);
        return ret;
    }

    public static <T> JsonResult<T> http403(T data) {
        JsonResult<T> ret = new JsonResult<T>();
        ret.setCode(JsonReturnCode.ACCESS_ERROR.getCode());
        ret.setMsg(JsonReturnCode.ACCESS_ERROR.getDesc());
        ret.setData(data);
        return ret;
    }

    public static <T> JsonResult<T> http413(T data) {
        JsonResult<T> ret = new JsonResult<T>();
        ret.setCode(JsonReturnCode.FILEMAX.getCode());
        ret.setMsg(JsonReturnCode.FILEMAX.getDesc());
        ret.setData(data);
        return ret;
    }

}
