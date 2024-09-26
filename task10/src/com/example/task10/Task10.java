package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if(Float.isNaN(a) && Float.isNaN(b)){
            return true;
        }
        if(Float.isInfinite(a) && Float.isInfinite(b)){
            return a == b;
        }

        return Math.abs(a - b) < 1f / Math.pow(10, precision);
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
