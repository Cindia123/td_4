package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void test0IsNotPrime() {
        assertFalse(primeChecker.isPrime(0), "0 should not be considered a prime number");
    }

    @Test
    public void test1IsNotPrime() {
        assertFalse(primeChecker.isPrime(1), "1 should not be considered a prime number");
    }

    @Test
    public void test2IsPrime() {
        assertTrue(primeChecker.isPrime(2), "2 should be considered a prime number");
    }

    @Test
    public void test4IsNotPrime() {
        assertFalse(primeChecker.isPrime(4), "4 should not be considered a prime number");
    }

    @Test
    public void testPrimesUpTo100() {
        List<Integer> expected = List.of(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

        List<Integer> found = new ArrayList<>();
        for (int n = 0; n <= 100; n++) {
            if (primeChecker.isPrime(n)) {
                found.add(n);
            }
        }

        assertEquals(expected, found, "Primes between 0 and 100 are incorrect");
    }
}