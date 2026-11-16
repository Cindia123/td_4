package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test1Returns1() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void test2Returns2() {
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void test3ReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void test5ReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void test15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    @Test
    public void test30ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(30));
    }

    @Test
    public void testAllNumbersFrom1To101() {
        String[] expected = {
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
            "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
            "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
            "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
            "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
            "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
            "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
            "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
            "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz",
            "101"
        };

        for (int number = 1; number <= 101; number++) {
            assertEquals(expected[number - 1], fizzBuzz.convert(number),
                    "Wrong result for " + number);
        }
    }
}