package net.cosnowski.interviewquiz.algorithm;


public class MergeSort
{
	static public <T extends Comparable<T>> void sort(T[] arr)
	{
		sort(arr, 0, arr.length - 1);
	}
	
	static public <T extends Comparable<T>> void sort(T[] arr, int begin, int end)
	{
		if (begin < end)
		{
			int mid = midPoint(begin, end);
			sort(arr, begin, mid);
			sort(arr, mid + 1, end);
			merge(arr, begin, mid, end);
		}
	}
	
	@SuppressWarnings("unchecked")
	static private <T extends Comparable<T>> void merge(T[] arr, int begin, int mid, int end)
	{
		int leftSize = mid - begin + 1;
		int rightSize = end - mid;
		Object[] left = new Object[leftSize + 1];
		Object[] right = new Object[rightSize + 1];
		for (int i = 0; i < leftSize; i++)
		{
			left[i] = arr[begin + i];
		}
		for (int i = 0; i < rightSize; i++)
		{
			right[i] = arr[(mid + 1) + i];
		}
		//  Last element in left and right is null which is needed
		int idxLeft = 0;
		int idxRight = 0;
		for (int i = begin; i <= end; i++)
		{
			if (left[idxLeft] == null)
			{
				arr[i] = (T)right[idxRight];
				idxRight++;
			}
			else if (right[idxRight] == null)
			{
				arr[i] = (T)left[idxLeft];
				idxLeft ++;
			}
			else if (((T)left[idxLeft]).compareTo((T)right[idxRight]) <= 0)
			{
				arr[i] = (T)left[idxLeft];
				idxLeft ++;
			}
			else
			{
				arr[i] = (T)right[idxRight];
				idxRight++;
			}
		}
	}
	
	static private int midPoint(int begin, int end)
	{
		return (int)Math.floor((begin + end) / 2);
	}
}
