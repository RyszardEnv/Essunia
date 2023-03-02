package org.example.sprint_2.nthSmallest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestNValueTest {

    @Test
    public void shouldReturn5() {
        //given
        SmallestNValue smallestNValue = new SmallestNValue();

        //when
        int result = smallestNValue.nthSmallest(new int[] {2, 3, 5, 1, 4}, 5);

        //then
        assertEquals(5, result);
    }

    @Test
    public void shouldThrowIllegalArgumentException() {
        //given
        SmallestNValue smallestNValue = new SmallestNValue();
        //then
        assertThrows(IllegalArgumentException.class, () -> smallestNValue.nthSmallest(new int[] {2, 3, 5, 1, 4}, 6));
    }

    @Test
    public void shouldWorkWithNegativeNumbers() {
        //given
        SmallestNValue smallestNValue = new SmallestNValue();

        //when
        int result = smallestNValue.nthSmallest(new int[] {-2, 0, -1, 1, 4}, 3);

        //then
        assertEquals(0, result);
    }

    @Test
    public void shouldWorkWithRepeatingNumbers() {
        //given
        SmallestNValue smallestNValue = new SmallestNValue();

        //when
        int result = smallestNValue.nthSmallest(new int[] {1, 0, 1, 1, 4}, 3);

        //then
        assertEquals(4, result);
    }
}