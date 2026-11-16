package com.example;

public class RomanNumerals {

    public String convert(int number) {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String result = "";
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result += symbols[i];
                number -= values[i];
            }
        }
        return result;
    }
}