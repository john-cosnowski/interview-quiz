package net.cosnowski.interviewquiz.util;

import java.util.Collection;

public class SortTestUtils
{
	/**
	 * @param <T>
	 * @param arr array to check
	 * @return true if arr[i] <= arr[i+1] for i=0..arr.length - 2
	 */
	public static <T extends Comparable<T>> boolean isMinOrdered(T[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i].compareTo(arr[i + 1]) > 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static <T extends Comparable<T>> void print(T[] arr)
	{
		print(null, arr);
	}
	
	public static <T extends Comparable<T>> void print(String hdr, T[] arr)
	{
		print(hdr, arr, true);
	}
	
	public static <T extends Comparable<T>> void print(String hdr, T[] arr, boolean newLine)
	{
		if (hdr != null)
		{
			System.out.print(hdr);
			System.out.print(": ");
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (i > 0)
			{
				System.out.print(',');
			}
			System.out.print(arr[i]);
		}
		if (newLine)
		{
			System.out.println();
		}
	}
	
	static <T extends Comparable<T>> void print(Collection<T> arr)
	{
		print(null, arr);
	}
	
	static <T extends Comparable<T>> void print(String hdr, Collection<T> arr)
	{
		print(hdr, arr, true);
	}
	
	static <T extends Comparable<T>> void print(String hdr, Collection<T> arr, boolean newLine)
	{
		if (hdr != null)
		{
			System.out.print(hdr);
			System.out.print(": ");
		}
		boolean first = true;
		for (T obj : arr)
		{
			if (!first)
			{
				System.out.print(',');
			}
			first = false;
			System.out.print(obj);
		}
		if (newLine)
		{
			System.out.println();
		}
	}
}
