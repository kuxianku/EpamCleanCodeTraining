package org.example;

public class ProductExceedsLimitException extends Exception {
    public ProductExceedsLimitException(String message) {
        super(message);
    }
}
