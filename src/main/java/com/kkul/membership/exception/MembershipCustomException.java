package com.kkul.membership.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class MembershipCustomException extends RuntimeException {
    public MembershipCustomException(String message) {
        super(message);
    }
}