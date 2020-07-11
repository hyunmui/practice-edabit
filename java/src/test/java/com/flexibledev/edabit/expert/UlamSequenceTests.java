package com.flexibledev.edabit.expert;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UlamSequenceTests {

    @Test
    public void test1() {
        assertEquals(4, Challenge.ulam(4));
    }

    @Test
    public void test2() {
        assertEquals(16, Challenge.ulam(9));
    }

    @Test
    public void test3() {
        assertEquals(180, Challenge.ulam(38));
    }

    @Test
    public void test4() {
        assertEquals(688, Challenge.ulam(99));
    }

    @Test
    public void test5() {
        assertEquals(1856, Challenge.ulam(206));
    }

    @Test
    public void test6() {
        assertEquals(5597, Challenge.ulam(495));
    }

    @Test
    public void test7() {
        assertEquals(6782, Challenge.ulam(577));
    }
}