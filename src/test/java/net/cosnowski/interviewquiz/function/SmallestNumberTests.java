package net.cosnowski.interviewquiz.function;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;



public class SmallestNumberTests
{
	@Test
	public void input_9_ShouldReturn_9()
	{
		final int input = 9;
		final int expected = 9;
		int actual = SmallestNumber.FindSmallestNumber(input);
		assertThat(expected, is(actual));
	}
	
	@Test
	public void input_213_ShouldReturn_123()
	{
		final int input = 213;
		final int expected = 123;
		int actual = SmallestNumber.FindSmallestNumber(input);
		assertThat(expected, is(actual));
	}
	
	@Test
	public void input_981115742_ShouldReturn_111245789()
	{
		final int input = 981115742;
		final int expected = 111245789;
		int actual = SmallestNumber.FindSmallestNumber(input);
		assertThat(expected, is(actual));
	}
	
	@Test
	public void input_100_ShouldReturn_100()
	{
		final int input = 100;
		final int expected = 100;
		int actual = SmallestNumber.FindSmallestNumber(input);
		assertThat(expected, is(actual));
	}
	
	@Test
	public void input_140_ShouldReturn_104()
	{
		final int input = 140;
		final int expected = 104;
		int actual = SmallestNumber.FindSmallestNumber(input);
		assertThat(expected, is(actual));
	}
	
	@Test
	public void input_9000100_ShouldReturn_1000009()
	{
		final int input = 9000100;
		final int expected = 1000009;
		int actual = SmallestNumber.FindSmallestNumber(input);
		assertThat(expected, is(actual));
	}
	
	@Test
	public void input_9080107_ShouldReturn_1000789()
	{
		final int input = 9080107;
		final int expected = 1000789;
		int actual = SmallestNumber.FindSmallestNumber(input);
		assertThat(expected, is(actual));
	}
}
