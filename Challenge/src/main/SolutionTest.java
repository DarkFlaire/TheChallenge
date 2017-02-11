package main;

import static org.junit.Assert.*;
import org.junit.Ignore;

import org.junit.Test;

public class SolutionTest {
	protected String a1 = "test";
	protected String a2 = "Try me.";
	protected String a3 = "i am a string";
	protected String a4 = "Give me a shot!!";
	@Test
	public void testReverse() {
		Solution tester = new Solution();
		String result = tester.reverse(a1);
		String result2 = tester.reverse(a2);
		String result3 = tester.reverse(a3);
		assertEquals("tset", result);
		assertEquals(".em yrT", result2);
		assertEquals("gnirts a ma i", result3);
	}
	
	@Test
	public void testReverseInPlace() {
		Solution tester = new Solution();
		assertEquals("i ma a gnirts", tester.reverseInPlace(a3));
	}
	
	@Ignore("Only if you're brave") 
	@Test
	public void testAdvanceReverse() {
		Solution tester = new Solution();
		assertEquals("Yrt em.", tester.advancedReverse(a2));
		assertEquals("Evig em a tohs!!", tester.advancedReverse(a4));
	}
}
