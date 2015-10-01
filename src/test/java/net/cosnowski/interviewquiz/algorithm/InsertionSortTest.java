package net.cosnowski.interviewquiz.algorithm;

import static org.junit.Assert.*;
import static net.cosnowski.interviewquiz.util.SortTestUtils.*;
import net.cosnowski.interviewquiz.algorithm.InsertionSort;

import org.junit.Test;


public class InsertionSortTest
{
	@Test
	public void sortTest1()
	{
		final Integer[] test = {7, 3, 52, 5, 6};
		print("Begin", test);
		InsertionSort.sort(test);
		print("End  ", test);
		assertTrue(isMinOrdered(test));
	}
	
	@Test
	public void sortTest2()
	{
		final Integer[] test = {7, 3, 7, 5, 3};
		print("Begin", test);
		InsertionSort.sort(test);
		print("End  ", test);
		assertTrue(isMinOrdered(test));
	}
	
	@Test
	public void sortTest3()
	{
		final String[] test = {"quit", "test", "foo", "bar"};
		print("Begin", test);
		InsertionSort.sort(test);
		print("End  ", test);
		assertTrue(isMinOrdered(test));
	}
}
