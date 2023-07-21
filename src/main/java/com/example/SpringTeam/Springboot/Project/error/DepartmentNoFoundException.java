package com.example.SpringTeam.Springboot.Project.error;

public class DepartmentNoFoundException extends Exception{
    public DepartmentNoFoundException() {
        super();
    }

    public DepartmentNoFoundException(String message) {
        super(message);
    }

    public DepartmentNoFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNoFoundException(Throwable cause) {
        super(cause);
    }

    protected DepartmentNoFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
