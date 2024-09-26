package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру
        int unicode = (int) c - 32;
        char upperCase = (char) unicode;

        return upperCase;
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);

    }

}
