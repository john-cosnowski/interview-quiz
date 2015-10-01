package net.cosnowski.interviewquiz.algorithm;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static net.cosnowski.interviewquiz.util.SortTestUtils.*;
import net.cosnowski.interviewquiz.algorithm.MergeSort;

import org.junit.Test;

public class MergeSortTest
{
	@Test
	public void mergeSort1Test()
	{
		final Integer[] test = {7, 3, 52, 5, 6, 29, 8, 45, -4, 700, 880, 250};
		print("Begin", test);
		MergeSort.sort(test);
		print("End  ", test);
		assertThat(isMinOrdered(test), is(true));
	}
}
