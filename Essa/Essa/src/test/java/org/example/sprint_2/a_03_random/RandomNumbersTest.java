package org.example.sprint_2.a_03_random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTest {

    @Test
    void random1() {
        int test1 = RandomNumbers.random(10);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int test2 = RandomNumbers.random(10);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int test3 = RandomNumbers.random(10);

        boolean result = test1 != test2 || test1 != test3;
        assertTrue(result);
    }

    @Test
    void random2(){
        assertThrows(IllegalArgumentException.class, () -> RandomNumbers.random(0));
    }

}