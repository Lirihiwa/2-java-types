package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int digits = 0;
        int summ = x + y;

        if(summ == 0) {
            return 1;
        }else{
            while(summ != 0) {
                summ = summ / 10;
                digits = digits + 1;
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
