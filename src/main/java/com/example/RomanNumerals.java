package com.example;

/** Converts integers to Roman numerals. */
public class RomanNumerals {

    private static final int[] VALUES =
            {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS =
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * @param number a positive integer (1 to 3999)
     * @return the Roman numeral for the number
     */
    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        int remaining = number;
        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }
        return result.toString();
    }
}