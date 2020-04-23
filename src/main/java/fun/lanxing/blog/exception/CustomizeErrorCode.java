package fun.lanxing.blog.exception;

public enum  CustomizeErrorCode implements ICustomizeErrorCode {

    BLOG_NOT_FOUND(2001,"你找的博客不在了，要不要换个试试？")
    ;
    private Integer code;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code,String message) {
        this.message = message;
        this.code = code;
    }
}
