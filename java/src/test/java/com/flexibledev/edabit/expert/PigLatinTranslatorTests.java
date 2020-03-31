package com.flexibledev.edabit.expert;

import static org.junit.Assert.assertEquals;

import com.flexibledev.edabit.Expert;

import org.junit.Test;

public class PigLatinTranslatorTests {
  @Test
  public void test1() {
    assertEquals("avehay", Expert.translateWord("have"));
  }

  @Test
  public void test2() {
    assertEquals("amcray", Expert.translateWord("cram"));
  }

  @Test
  public void test3() {
    assertEquals("aketay", Expert.translateWord("take"));
  }

  @Test
  public void test4() {
    assertEquals("Atcay", Expert.translateWord("Cat"));
  }

  @Test
  public void test5() {
    assertEquals("Impshray", Expert.translateWord("Shrimp"));
  }

  @Test
  public void test6() {
    assertEquals("ebuchettray", Expert.translateWord("trebuchet"));
  }

  @Test
  public void test7() {
    assertEquals("ateyay", Expert.translateWord("ate"));
  }

  @Test
  public void test8() {
    assertEquals("Appleyay", Expert.translateWord("Apple"));
  }

  @Test
  public void test9() {
    assertEquals("oakenyay", Expert.translateWord("oaken"));
  }

  @Test
  public void test10() {
    assertEquals("eagleyay", Expert.translateWord("eagle"));
  }

  @Test
  public void test11() {
    assertEquals("inkyay", Expert.translateWord("ink"));
  }

  @Test
  public void test12() {
    assertEquals("unicornyay", Expert.translateWord("unicorn"));
  }

  @Test
  public void test13() {
    assertEquals("", Expert.translateWord(""));
  }

  @Test
  public void test14() {
    assertEquals("Iyay ikelay otay eatyay oneyhay afflesway", Expert.translateSentence("I like to eat honey waffles"));
  }

  @Test
  public void test15() {
    assertEquals("Oday ouyay inkthay ityay isyay oinggay otay ainray odaytay?",
        Expert.translateSentence("Do you think it is going to rain today?"));
  }

  @Test
  public void test16() {
    assertEquals("Ehay aidsay, \"Enwhay illway isthay allyay endyay?\"",
        Expert.translateSentence("He said, \"When will this all end?\""));
  }

  @Test
  public void test17() {
    assertEquals("", Expert.translateSentence(""));
  }
}