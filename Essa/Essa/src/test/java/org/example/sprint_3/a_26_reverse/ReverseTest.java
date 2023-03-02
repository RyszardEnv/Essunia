package org.example.sprint_3.a_26_reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    public void reverse1(){
        assertEquals("kota! ma Ala",new String(Reverse.reverse("Ala ma kota!".toCharArray())));
    }

    @Test
    public void reverse2(){
        assertEquals("away far far, galaxy a in ago, time long A",new String(Reverse.reverse("A long time ago, in a galaxy far, far away".toCharArray())));
    }

    @Test
    public void reverse3(){
        assertThrows(IllegalArgumentException.class, ()->Reverse.reverse(new char[0]));
    }


}