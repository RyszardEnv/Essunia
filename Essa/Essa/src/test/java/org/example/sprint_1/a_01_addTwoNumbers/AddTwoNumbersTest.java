package org.example.sprint_1.a_01_addTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    public void testAddPositiveNumbers() {
        //given
        AddTwoNumbers calculator = new AddTwoNumbers();

        //when
        int result = calculator.add(5, 10);

        //then
        assertEquals(15, result);
    }

    @Test
    public void testAddPositiveNumberAndZero() {
        //given
        AddTwoNumbers calculator = new AddTwoNumbers();

        //when
        int result = calculator.add(5, 0);

        //then
        assertEquals(5, result);
    }

    @Test
    public void testAddNegativeNumberAndPositive() {
        //given
        AddTwoNumbers calculator = new AddTwoNumbers();

        //when
        int result = calculator.add(-5, 2);

        //then
        assertEquals(-3, result);
    }

    @Test
    public void testAddPositiveNumberAndNegative() {
        //given
        AddTwoNumbers calculator = new AddTwoNumbers();

        //when
        int result = calculator.add(5, -2);

        //then
        assertEquals(3, result);
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        //given
        AddTwoNumbers calculator = new AddTwoNumbers();

        //when
        int result = calculator.add(-3, -2);

        //then
        assertEquals(-5, result);
    }
}