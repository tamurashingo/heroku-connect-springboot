package com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot;

public class HerokuconnectException extends Exception {
    private static final long serialVersionUID = 1;

    public HerokuconnectException(String message) {
        super(message);
    }

    public HerokuconnectException(String message, Throwable cause) {
        super(message, cause);
    }

    public HerokuconnectException(Throwable cause) {
        super(cause);
    }
}
