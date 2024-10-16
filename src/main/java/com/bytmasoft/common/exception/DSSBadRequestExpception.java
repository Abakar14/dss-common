package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DSSBadRequestExpception extends DSSApplicationException{

    public DSSBadRequestExpception() {
        super();
    }

    public DSSBadRequestExpception(String message) {
        super(message);
    }

    public DSSBadRequestExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSBadRequestExpception(Exception ex) {
        super(ex);
    }
}
