package org.example.sprint_3.a_14_prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeTest {
    @Test
    void shouldReturnZeroForOne() {
        int expectedValue = 0;
        int numberOfPrimeNumbers = Prime.countPrimeNumbersSmallerThanGivenNumber(1);
        assertEquals(expectedValue, numberOfPrimeNumbers);
    }

    @Test
    void shouldReturnOneNumberForTwo() {
        int expectedValue = 0;
        int numberOfPrimeNumbers = Prime.countPrimeNumbersSmallerThanGivenNumber(2);
        assertEquals(expectedValue, numberOfPrimeNumbers);
    }


    @Test
    void shouldReturnFourForTen() {
        int expectedValue = 4;
        int numberOfPrimeNumbers = Prime.countPrimeNumbersSmallerThanGivenNumber(10);
        assertEquals(expectedValue, numberOfPrimeNumbers);
    }

}