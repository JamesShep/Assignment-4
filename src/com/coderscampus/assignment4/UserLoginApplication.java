package com.coderscampus.assignment4;

import java.io.IOException;

public class UserLoginApplication {

    private static UserService userService = new UserService();

    public static void main(String[] args) {


        userService.retrieveUser();
        userService.validateLogin();
    }
}