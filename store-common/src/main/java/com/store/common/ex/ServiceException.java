package com.store.common.ex;

/**
 * Package-name: com.store.common.ex
 * Project-name: MyShop
 * Author: Neko
 * 22-12-2023  20:09
 * Describe：
 */

public class ServiceException extends RuntimeException {
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
