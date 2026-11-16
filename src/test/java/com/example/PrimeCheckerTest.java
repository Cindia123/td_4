package com.example;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    private final PrimeChecker checker = new PrimeChecker();

    @Test
    void twoAndThreeArePrime() {
        assertTrue(checker.isPrime(0));
    }
}