package com.flexibledev.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTests {
	@Test
	public void test1() {
		assertEquals("Nope!", 5, Challenge.getCount("Celebration"));
	}

	@Test
	public void test2() {
		assertEquals("Nope!", 1, Challenge.getCount("Palm"));
	}

	@Test
	public void test3() {
		assertEquals("Nope!", 4, Challenge.getCount("Prediction"));
	}

	@Test
	public void test4() {
		assertEquals("Nope!", 3, Challenge.getCount("Suite"));
	}

	@Test
	public void test5() {
		assertEquals("Nope!", 3, Challenge.getCount("Quote"));
	}

	@Test
	public void test6() {
		assertEquals("Nope!", 3, Challenge.getCount("Portrait"));
	}

	@Test
	public void test7() {
		assertEquals("Nope!", 2, Challenge.getCount("Steam"));
	}

	@Test
	public void test8() {
		assertEquals("Nope!", 2, Challenge.getCount("Tape"));
	}

	@Test
	public void test9() {
		assertEquals("Nope!", 3, Challenge.getCount("Nightmare"));
	}

	@Test
	public void test10() {
		assertEquals("Nope!", 4, Challenge.getCount("Convention"));
	}
}