package com.example.mytest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void subtraction_isCorrect() {
        assertEquals(0, 2 - 2);
    }

    @Test
    public void multiplication_isCorrect() {
        assertEquals(4, 2 * 2);
    }

    @Test
    public void division_isCorrect() {
        assertEquals(2, 4 / 2);
    }

    @Test
    public void modulus_isCorrect() {
        assertEquals(1, 5 % 2);
    }
}
