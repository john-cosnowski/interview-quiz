package net.cosnowski.interviewquiz.algorithm;

import static net.cosnowski.interviewquiz.util.SortUtils.swap;

public class QuickSort
{
	static public <T extends Comparable<T>> void qsort1(T[] arr)
	{
		qsort1(arr, 0, arr.length - 1);
	}
	
	static public <T extends Comparable<T>> void qsort1(T[] arr, int begin, int end)
	{
		if (begin < end)
		{
			int q = partition(arr, begin, end);
			qsort1(arr, begin, q - 1);
			qsort1(arr, q + 1, end);
		}
	}
	
	static private <T extends Comparable<T>> int partition(T[] arr, int begin, int end)
	{
		T x = arr[end];
		int i = begin - 1;
		for (int j = begin; j <= end; j++)
		{
			if (x.compareTo(arr[j]) > 0)
			{
				i = i + 1;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, end);
		return i + 1;
	}
}
