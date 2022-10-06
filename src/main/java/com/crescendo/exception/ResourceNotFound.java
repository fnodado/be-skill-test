package com.crescendo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 5753930870774878968L;

    public ResourceNotFound(String message) {
        super(message);
    }
}
