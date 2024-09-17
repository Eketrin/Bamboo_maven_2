package org.example;



public class Main {
    public static void main(String[] args) {
        System.out.println("hello and welcome");

    }
    public static boolean isEqu(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    public static boolean validatePasswordCheck(String password) {
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }
        if (!password.matches("[A-Za-z0-9]")) {
            return false;
        }

        return true;
    }
}