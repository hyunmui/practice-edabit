package com.flexibledev.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EqualityTests {

    @Test
    public void test1() {
        System.out.println("Should work if no values are the same.");
        assertEquals(0, Challenge.getEquality(2, 3, 4));
    }

    @Test
    public void test2() {
        System.out.println("Should work if no values are the same.");
        assertEquals(0, Challenge.getEquality(1, 7, 6));
    }

    @Test
    public void test3() {
        System.out.println("Should work if no values are the same.");
        assertEquals(0, Challenge.getEquality(7, 3, 4));
    }

    @Test
    public void test4() {
        System.out.println("Should work if two values are the same.");
        assertEquals(2, Challenge.getEquality(3, 3, 6));
    }

    @Test
    public void test5() {
        System.out.println("Should work if two values are the same.");
        assertEquals(2, Challenge.getEquality(7, 3, 7));
    }

    @Test
    public void test6() {
        System.out.println("Should work if all three values are the same.");
        assertEquals(3, Challenge.getEquality(1, 1, 1));
    }

    @Test
    public void test7() {
        System.out.println("Should work if all three values are the same.");
        assertEquals(3, Challenge.getEquality(7, 7, 7));
    }

    @Test
    public void test8() {
        System.out.println("Should work if all three values are the same.");
        assertEquals(3, Challenge.getEquality(4, 4, 4));
    }
}