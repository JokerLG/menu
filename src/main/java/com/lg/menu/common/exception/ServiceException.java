package com.lg.menu.common.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 业务异常类
 * 用于封装业务层的异常信息，区别于系统异常（如NullPointerException）
 */
@Data
public class ServiceException extends RuntimeException {

    /**
     * 错误码（自定义，用于前端识别具体错误类型）
     */
    private Integer code;

    /**
     * 错误信息（用于前端展示的友好提示）
     */
    private String message;

    /**
     * 无参构造方法
     */
    public ServiceException() {
        super();
    }

    /**
     * 仅包含错误信息的构造方法
     * @param message 错误提示信息
     */
    public ServiceException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * 包含错误码和错误信息的构造方法（最常用）
     * @param code 错误码（如：10001-参数错误，20001-用户不存在）
     * @param message 错误提示信息
     */
    public ServiceException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 包含错误码、错误信息和根异常的构造方法（用于包装底层异常）
     * @param code 错误码
     * @param message 错误提示信息
     * @param cause 根异常（如数据库异常、第三方接口异常）
     */
    public ServiceException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}