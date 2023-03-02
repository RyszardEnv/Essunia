package org.example.sprint_2.a_21_duplicates;

import java.util.Arrays;

public class Duplicates {
    public static int countRecurringDifferentChars(char[] array) {
        int counter = 0;
        boolean isAdded = false;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            char previous = array[i - 1];
            char current = array[i];
            if (previous == current) {
                if (!isAdded) {
                    counter++;
                    isAdded = true;
                }
            } else {
                isAdded = false;
            }
        }
        return counter;
    }
}
