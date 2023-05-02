package com.it355.dz08.exceptions;

public class NotFoundByIdException extends RuntimeException {
    public NotFoundByIdException(String s) {
        super(s);
    }
}
