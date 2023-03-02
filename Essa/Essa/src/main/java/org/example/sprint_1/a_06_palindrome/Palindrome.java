package org.example.sprint_1.a_06_palindrome;

public class Palindrome {
    public static boolean isPalindrome(char[] array) {
        for (int i = 0; i < array.length / 2 + 1; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
