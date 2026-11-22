package com.exemple;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculatrice;

    @BeforeEach
    void preparer() {
        calculatrice = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculatrice.addition(2, 3));
        assertEquals(0, calculatrice.addition(-1, 1));
    }

    @Test
    void testSoustraction() {
        assertEquals(2, calculatrice.soustraction(5, 3));
        assertEquals(-2, calculatrice.soustraction(3, 5));

