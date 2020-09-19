package com.ssm.Util;

/**
 * @data 2020/9/19 15:34
 */
public class Message {
    /**
     * 状态码，成功是0，失败是1
     */
    private int code;
    /**
     * 状态信息
     */
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
