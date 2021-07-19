package com.bridgelabz.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.programs.MoodAnalyzer;

import junit.framework.Assert;

public class MoodAnalyzerTest {

	@Test
	public void test() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String actual = moodAnalyzer.analyseMood("i am in sad mood");
		String expected = "SAD";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test1() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String actual = moodAnalyzer.analyseMood("i am in any  mood");
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);
	}
}
