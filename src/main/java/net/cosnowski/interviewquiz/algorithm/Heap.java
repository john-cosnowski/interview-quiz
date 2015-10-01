package net.cosnowski.interviewquiz.algorithm;

import java.util.Comparator;

public class Heap {

	public static class HeapData<T extends Comparable<T>>  {
		
		T[] arr;
		int heapSize;
		
		public HeapData(T[] arr)  {
			this(arr, arr.length);
		}
		
		public HeapData(T[] arr, int heapSize)  {
			if (arr == null)  {
				throw new IllegalArgumentException("arr is null");
			}
			if (heapSize > arr.length)  {
				throw new IllegalArgumentException(String.format("heapSize is too large (%d > %d)", heapSize, arr.length));
			}
			this.arr = arr;
			this.heapSize = heapSize;
		}
		
		public int getHeapSize()  {
			return heapSize;
		}
		
		public T[] getHeap()  {
			return arr;
		}
		
		public T get(int index)  {
			if (index > heapSize)  {
				throw new ArrayIndexOutOfBoundsException("index out of bounds");
			}
			return arr[index];
		}
	}
	
	public static <T extends Comparable<T>> void buildMaxHeap(HeapData<T> arr)  {
		validateHeapData(arr);
		for (int i = arr.getHeapSize() / 2; i >= 0; i--)  {
			maxHeapify(arr, i);
		}
	}
	
	public static <T extends Comparable<T>> void maxHeapify(HeapData<T> arr, int index)  {
		heapify(arr, (o1, o2) -> o1.compareTo(o2), index);
	}
	
	public static <T extends Comparable<T>> void heapify(HeapData<T> arr, Comparator<T> ordering, int index)  {
		int l = left(index);
		int r = right(index);
		int largest;
		if (l < arr.getHeapSize() && ordering.compare(arr.get(l), arr.get(index)) > 0)  {
			largest = l;
		} else {
			largest = index;
		}
		if (r < arr.getHeapSize() && ordering.compare(arr.get(r), arr.get(largest)) > 0)  {
			largest = r;
		}
		if (largest != index)  {
			exchange(arr.getHeap(), index, largest);
			heapify(arr, ordering, largest);
		}
	}
	
	private static <T> void exchange(T[] arr, int one, int two)  {
		T temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
	
	@SuppressWarnings("unused")
	private static int parent(int i)  {
		return (int)Math.floor(i / 2);
	}
	
	private static int left(int i)  {
		return 2 * i;
	}
	
	private static int right(int i)  {
		return (2 * i) + 1;
	}
	
	private static <T extends Comparable<T>> void validateHeapData(HeapData<T> arr)  {
		T[] heapArray = arr.getHeap();
		for (int i = 0; i < arr.getHeapSize(); i++)  {
			if (heapArray[i] == null)  {
				throw new IllegalStateException("Vector contains null element");
			}
		}
	}
}
