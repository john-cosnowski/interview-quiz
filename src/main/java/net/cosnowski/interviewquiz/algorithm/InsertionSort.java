package net.cosnowski.interviewquiz.algorithm;

public class InsertionSort
{
	static public <T extends Comparable<T>> void sort(T[] arr)
	{
		sort(arr, 0, arr.length - 1);
	}
	
	static public <T extends Comparable<T>> void sort(T[] arr, int begin, int end)
	{
		for (int i = begin + 1; i <= end; i++) {
			T key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0)  {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
