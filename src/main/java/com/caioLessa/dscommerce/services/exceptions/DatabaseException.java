package com.caioLessa.dscommerce.services.exceptions;

public class DatabaseException extends RuntimeException{
    public DatabaseException(String message) {
        super(message);
    }
}
