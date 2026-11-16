package com.example;

/** Converts numbers to their Fizz/Buzz representation. */
public class FizzBuzz {

    /**
     * @param number a positive integer
     * @return "FizzBuzz", "Fizz", "Buzz" or the number itself as a string
     */
    public String convert(int number) {
        if (isMultipleOf(number, 15)) {
            return "FizzBuzz";
        }
        if (isMultipleOf(number, 3)) {
            return "Fizz";
        }
        if (isMultipleOf(number, 5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }
}