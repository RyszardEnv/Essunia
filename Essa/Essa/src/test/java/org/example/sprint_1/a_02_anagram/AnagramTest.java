package org.example.sprint_1.a_02_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testAnagram1() {
        char[] a = "AAAA".toCharArray();
        assertTrue(Anagram.anagram(a, "AAAA".toCharArray()));
    }

    @Test
    void testAnagram2() {
        assertFalse(Anagram.anagram(new char[]{'\u0004', 'A', 'A', 'A'}, "AAAA".toCharArray()));
    }

    @Test
    void testAnagram3() {
        assertFalse(Anagram.anagram(new char[5], "AAAA".toCharArray()));
    }

    @Test
    void testAnagram4() {
        char[] a = "DUPA".toCharArray();
        assertTrue(Anagram.anagram(a, "UPAD".toCharArray()));
    }
}