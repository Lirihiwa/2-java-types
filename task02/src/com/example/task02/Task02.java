package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            byte num = Byte.parseByte(input);
            return "byte";
        } catch (NumberFormatException e1) {
            try {
                short num = Short.parseShort(input);
                return "short";
            } catch (NumberFormatException e2) {
                try {
                    int num = Integer.parseInt(input);
                    return "int";
                } catch (NumberFormatException e3) {
                    try {
                        long num = Long.parseLong(input);
                        return "long";
                    } catch (NumberFormatException e4) {
                        return "число не подходит";
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        String result = solution("5");
        System.out.println(result);
         */
    }

}
