package com.example.creenapp;

class MiscFunc {
    public static boolean  isEmailValid(String email) {
        return (email.contains("@") && email.contains("."));
    }

    public static boolean isPasswordValid(String password) {
        return password.length() > 5;
    }
}
