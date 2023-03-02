package org.example.sprint_1.a_02_anagram;

public class Anagram {

    public static boolean anagram(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < b.length; i++) {
            count[b[i]]++;
        }

        for (int i = 0; i < a.length; i++) {
            count[a[i]]--;
            if (count[a[i]] < 0) {
                return false;
            }
        }

        return true;
    }

}
