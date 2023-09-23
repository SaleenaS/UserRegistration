package com.example.userlogin.userlogin;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler
{
    @ExceptionHandler(UserNotFoundException.class)
    public String exceptionHandler(UserNotFoundException exception)
    {
        return  "UserNotFoundException"+exception.getMessage();
    }
}
