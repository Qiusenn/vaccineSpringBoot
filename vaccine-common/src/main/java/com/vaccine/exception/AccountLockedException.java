package com.vaccine.exception;

/**
 * 账号被锁定异常
 */
public class AccountLockedException extends com.vaccine.exception.BaseException {

    public AccountLockedException() {
    }

    public AccountLockedException(String msg) {
        super(msg);
    }

}
