package org.example.sprint_3.a_23_power;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void power1(){
        assertEquals(27, Power.power(3,3));
    }

    @Test
    void power2(){
        assertEquals(-27, Power.power(-3,3));
    }

    @Test
    void power3(){
        assertEquals(1024, Power.power(2,10));
    }

    @Test
    void power4(){
        assertThrows(IllegalArgumentException.class, ()-> Power.power(2,-2));
    }

    @Test
    void power5(){
        assertEquals(1, Power.power(3,0));
    }

}