package com.flexibledev.edabit.expert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NextNumberTests {
    @Test
    public void test1() {
        assertEquals(7, Challenge.nextNumber(7));
    }

    @Test
    public void test2() {
        assertEquals(91, Challenge.nextNumber(19));
    }

    @Test
    public void test3() {
        assertEquals(271, Challenge.nextNumber(217));
    }

    @Test
    public void test4() {
        assertEquals(989, Challenge.nextNumber(899));
    }

    @Test
    public void test5() {
        assertEquals(998, Challenge.nextNumber(989));
    }

    @Test
    public void test6() {
        assertEquals(1151, Challenge.nextNumber(1115));
    }

    @Test
    public void test7() {
        assertEquals(2354, Challenge.nextNumber(2345));
    }

    @Test
    public void test8() {
        assertEquals(4235, Challenge.nextNumber(3542));
    }

    @Test
    public void test9() {
        assertEquals(5432, Challenge.nextNumber(5432));
    }

    @Test
    public void test10() {
        assertEquals(57821, Challenge.nextNumber(57812));
    }

    @Test
    public void test11() {
        assertEquals(57281, Challenge.nextNumber(57218));
    }

    @Test
    public void test12() {
        assertEquals(59348, Challenge.nextNumber(58943));
    }

    @Test
    public void test13() {
        assertEquals(97410, Challenge.nextNumber(97410));
    }

    @Test
    public void test14() {
        assertEquals(718329, Challenge.nextNumber(718293));
    }

    @Test
    public void test15() {
        assertEquals(619128, Challenge.nextNumber(618921));
    }

    @Test
    public void test16() {
        assertEquals(972346, Challenge.nextNumber(967432));
    }

    @Test
    public void test17() {
        assertEquals(890142, Challenge.nextNumber(890124));
    }

    @Test
    public void test18() {
        assertEquals(9321354, Challenge.nextNumber(9321345));
    }

    @Test
    public void test19() {
        assertEquals(219034576, Challenge.nextNumber(219034567));
    }

    @Test
    public void test20() {
        assertEquals(231456789, Challenge.nextNumber(219876543));
    }
}