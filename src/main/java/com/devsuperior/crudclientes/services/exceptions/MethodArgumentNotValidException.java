package com.devsuperior.crudclientes.services.exceptions;

public class MethodArgumentNotValidException extends RuntimeException {

    public MethodArgumentNotValidException(String msg) {
        super(msg);

    }
}
