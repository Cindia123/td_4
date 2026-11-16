package com.example;

/** Checks whether a number is prime. */
public class PrimeChecker {

    /**
     * Determines whether a number is prime.
     *
     * @param number the number to check (assumed valid, starting at 0)
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        return hasNoDivisorUpToSquareRoot(number);
    }

    private boolean hasNoDivisorUpToSquareRoot(int number) {
        for (int divisor = 2; (long) divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}