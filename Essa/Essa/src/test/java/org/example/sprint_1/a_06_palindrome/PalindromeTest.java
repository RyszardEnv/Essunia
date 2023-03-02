package org.example.sprint_1.a_06_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    void shouldReturnTrueWhenEvenArrayLength() {
        char[] array = {'m', 'e', 'e', 'm'};
        boolean result = Palindrome.isPalindrome(array);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenOddArrayLength() {
        char[] array = {'m', 'e', 'm'};
        boolean result = Palindrome.isPalindrome(array);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenEvenArrayLength() {
        char[] array = {'m', 'e', 'm', 'y'};
        boolean result = Palindrome.isPalindrome(array);
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenOddArrayLength() {
        char[] array = {'m', 'e', 'e', 'm', 'y'};
        boolean result = Palindrome.isPalindrome(array);
        assertFalse(result);
    }
}