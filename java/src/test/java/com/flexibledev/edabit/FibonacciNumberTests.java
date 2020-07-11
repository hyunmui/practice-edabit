package com.flexibledev.edabit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciNumberTests {

    @Test
    public void test1() {
        assertEquals(3, Challenge.fibonacci(3));
    }

    @Test
    public void test2() {
        assertEquals(21, Challenge.fibonacci(7));
    }

    @Test
    public void test3() {
        assertEquals(233, Challenge.fibonacci(12));
    }

    @Test
    public void test4() {
        assertEquals(1, Challenge.fibonacci(0));
    }

    @Test
    public void test5() {
        assertEquals(1, Challenge.fibonacci(1));
    }
}