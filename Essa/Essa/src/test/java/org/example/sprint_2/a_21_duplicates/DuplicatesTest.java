package org.example.sprint_2.a_21_duplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {
    @Test
    void shouldCount2DifferentChars() {
        char[] array = {'w', 'a', 'r', 's', 'z', 'a', 'w', 'a'};
        int differentChars = Duplicates.countRecurringDifferentChars(array);
        assertEquals(2, differentChars);
    }

    @Test
    void shouldCount0DifferentChars() {
        char[] array = {'k', 'a', 't', 'o', 'w', 'i', 'c', 'e'};
        int differentChars = Duplicates.countRecurringDifferentChars(array);
        assertEquals(0, differentChars);
    }

    @Test
    void shouldCount0DifferentCharsWhenArrayEmpty() {
        char[] array = {};
        int differentChars = Duplicates.countRecurringDifferentChars(array);
        assertEquals(0, differentChars);
    }

}