package com.lee93.coc.exception;

import com.lee93.coc.enums.ResponseStatus;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

    private ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
