package net.cosnowski.interviewquiz.util;

public class SortUtils
{
	public static <T> void swap(T[] arr, int i, int j)
	{
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
