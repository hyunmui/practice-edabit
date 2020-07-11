package com.flexibledev.edabit.expert;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ConnectingWordsTests {
    @Test
    public void test1() {
        assertThat(Challenge.join(new String[] { "happy", "python", "honey", "yelp", "plank", "lanky" }),
                is(new String[] { "happythoneyelplanky", "1" }));
    }

    @Test
    public void test2() {
        assertThat(Challenge.join(new String[] { "move", "over", "very" }), is(new String[] { "movery", "3" }));
    }

    @Test
    public void test3() {
        assertThat(Challenge.join(new String[] { "oven", "envier", "erase", "serious" }),
                is(new String[] { "ovenvieraserious", "2" }));
    }

    @Test
    public void test4() {
        assertThat(Challenge.join(new String[] { "to", "ops", "psy", "syllable" }),
                is(new String[] { "topsyllable", "1" }));
    }

    @Test
    public void test5() {
        assertThat(Challenge.join(new String[] { "aaa", "bbb", "ccc", "ddd" }),
                is(new String[] { "aaabbbcccddd", "0" }));
    }

    @Test
    public void test6() {
        assertThat(Challenge.join(new String[] { "abcde", "bcdefghi", "efghi", "fghij", "ghijklmnop" }),
                is(new String[] { "abcdefghijklmnop", "4" }));
    }

    @Test
    public void test7() {
        assertThat(Challenge.join(new String[] { "aab", "abcccd", "cdeeef", "effff" }),
                is(new String[] { "aabcccdeeeffff", "2" }));
    }
}