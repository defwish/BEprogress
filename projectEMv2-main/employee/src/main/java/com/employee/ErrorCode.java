package com.employee;

public enum ErrorCode {
    NOT_FOUND(404, "Resource not found"),
    BAD_REQUEST(400, "Bad request"),
    METHOD_NOT_ALLOWED(405, "Method not allowed"),
    UNAUTHORIZED(401, "Unauthorized"),
    ;

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
