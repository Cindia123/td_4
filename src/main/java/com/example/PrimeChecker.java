package com.example;

/** Checks whether a number is prime. */
public class PrimeChecker {

    /**
     * @param number the number to check (assumed valid, starting at 0)
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; (long) i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}