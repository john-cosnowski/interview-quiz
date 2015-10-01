package net.cosnowski.interviewquiz.algorithm;

import static net.cosnowski.interviewquiz.util.SortTestUtils.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import net.cosnowski.interviewquiz.algorithm.QuickSort;

import org.junit.Test;


public class QuickSortTest
{
	@Test
	public void quickSortTest1()
	{
		final Integer[] test = {7, 3, 52, 5, 6, -5, 589, 123455, 6688, 1, -145, 5566};
		print("Begin", test);
		QuickSort.qsort1(test);
		print("End  ", test);
		assertThat(isMinOrdered(test), is(true));
	}
}
