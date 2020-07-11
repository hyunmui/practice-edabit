package com.flexibledev.edabit.expert;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class BellNumberTests {
    @Test
    public void test1() {
        assertEquals(1, Challenge.bell(1));
    }

    @Test
    public void test2() {
        assertEquals(2, Challenge.bell(2));
    }

    @Test
    public void test3() {
        assertEquals(5, Challenge.bell(3));
    }

    @Test
    public void test4() {
        assertEquals(15, Challenge.bell(4));
    }

    @Test
    public void test5() {
        assertEquals(52, Challenge.bell(5));
    }

    @Test
    public void test6() {
        assertEquals(203, Challenge.bell(6));
    }
}