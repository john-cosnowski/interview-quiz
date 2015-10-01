package net.cosnowski.interviewquiz.algorithm;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HeapTest {

	@Test
	public void test() {
		Integer[] testData = {8, 22, 4, 7, 3, 92, 1, 44, 66};
		Heap.HeapData<Integer> test = new Heap.HeapData<Integer>(testData);
		Heap.buildMaxHeap(test);
		assertThat(test.get(0), is(92));
	}
}
