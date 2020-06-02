package com.flexibledev.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidVariableNameTests {
  @Test
  public void test1() {
    assertEquals(true, Challenge.variableValid("result"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, Challenge.variableValid("odd_nums"));
  }
	
	@Test
  public void test3() {
    assertEquals(false, Challenge.variableValid("2TimesN"));
  }
	
	@Test
  public void test4() {
    assertEquals(true, Challenge.variableValid("rather_long_variable_name"));
  }
	
	@Test
  public void test5() {
    assertEquals(false, Challenge.variableValid("count spaces"));
  }
	
	@Test
  public void test6() {
    assertEquals(true, Challenge.variableValid("nTimes2"));
  }
}