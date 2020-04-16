package com.flexibledev.edabit.expert;

import static org.junit.Assert.assertEquals;

import com.flexibledev.edabit.Expert;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class BellNumberTests {
    @Test
    public void test1() {
        assertEquals(1, Expert.bell(1));
    }

    @Test
    public void test2() {
        assertEquals(2, Expert.bell(2));
    }

    @Test
    public void test3() {
        assertEquals(5, Expert.bell(3));
    }

    @Test
    public void test4() {
        assertEquals(15, Expert.bell(4));
    }

    @Test
    public void test5() {
        assertEquals(52, Expert.bell(5));
    }

    @Test
    public void test6() {
        assertEquals(203, Expert.bell(6));
    }
}