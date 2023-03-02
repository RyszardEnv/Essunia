package org.example.sprint_2.a_07_myPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountPITest {

    @Test
    void shouldReturnFourValueForFirstIteration() {
        double first = 4.0;
        String piForFirstDigit = String.valueOf(CountPI.countPi(1));

       assertEquals(first, piForFirstDigit);

    }
}