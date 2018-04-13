package com.dzjt.cbs.uam.security.common.exception.auth;


import com.dzjt.cbs.uam.security.common.constant.CommonConstants;
import com.dzjt.cbs.uam.security.common.exception.BaseException;

/**
 * Created by XT on 2018/2/10.
 */
public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
