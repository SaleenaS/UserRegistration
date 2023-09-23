package com.example.userlogin.userlogin;

public class UserNotFoundException extends RuntimeException
{
    public  UserNotFoundException(String message)
    {
        super(message);
    }

}
