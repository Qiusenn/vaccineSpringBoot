package com.vaccine.exception;

/**
 * 账号不存在异常
 */
public class AccountNotFoundException extends com.vaccine.exception.BaseException {

    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }

}
