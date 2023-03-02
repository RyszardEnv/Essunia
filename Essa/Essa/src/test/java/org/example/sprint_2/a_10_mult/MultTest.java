package org.example.sprint_2.a_10_mult;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultTest {

    @Test
    void mult1() {
        assertEquals(15, Mult.mult(3,5));
    }

    @Test
    void mult2() {
        assertEquals(-15, Mult.mult(3,-5));
    }

    @Test
    void mult3() {
        assertEquals(-15, Mult.mult(-3,5));
    }

    @Test
    void mult4() {
        assertEquals(0, Mult.mult(3,0));
    }
}