package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

    //test cases for add()
    @Test
    public void shouldAddPositiveNumbers(){

        assertEquals(5, calc.add(2, 3));
        assertEquals(1, calc.add(1, 0));
        assertEquals(10, calc.add(9, 1));
    }
    @Test
    public void shouldAddNegativeNumbers(){

        assertEquals(-5, calc.add(-2, -3));
        assertEquals(-2, calc.add(-1, -1));
        assertEquals(-10, calc.add(-9, -1));
    }
    @Test
    public void shouldAddZeros(){

        assertEquals(-5, calc.add(-5, 0));
        assertEquals(-2, calc.add(0, -2));
        assertEquals(0, calc.add(0, 0));

    }

    //test cases for subtract()

    @Test
    public void shouldSubtractPositiveNumbers(){

        assertEquals(-1, calc.subtract(2, 3));
        assertEquals(1, calc.subtract(1, 0));
        assertEquals(8, calc.subtract(9, 1));
    }
    @Test
    public void shouldSubtractNegativeNumbers(){

        assertEquals(1, calc.subtract(-2, -3));
        assertEquals(0, calc.subtract(-1, -1));
        assertEquals(-8, calc.subtract(-9, -1));
    }
    @Test
    public void shouldSubtractZeros(){

        assertEquals(-5, calc.subtract(-5, 0));
        assertEquals(2, calc.subtract(0, -2));
        assertEquals(0, calc.subtract(0, 0));

    }


    ////test cases for multiply()

    @Test
    public void shouldMultiplyPositiveNumbers(){

        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(1, 0));
        assertEquals(9, calc.multiply(9, 1));
    }
    @Test
    public void shouldMultiplyNegativeNumbers(){

        assertEquals(6, calc.multiply(-2, -3));
        assertEquals(1, calc.multiply(-1, -1));
        assertEquals(9, calc.multiply(-9, -1));
    }
    @Test
    public void shouldMultiplyZeros(){

        assertEquals(0, calc.multiply(-5, 0));
        assertEquals(0, calc.multiply(0, -2));
        assertEquals(0, calc.multiply(0, 0));

    }






}
