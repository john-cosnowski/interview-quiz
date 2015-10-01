package net.cosnowski.interviewquiz.list;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ListFunctionsTest {

    @Test
    public void buildShouldReturnNull() {
        LinkedListNode<Integer> result = ListFunctions.build();
        assertThat(result, is(nullValue()));
    }

    @Test
    public void buildShouldReturnOne() {
        LinkedListNode<Integer> result = ListFunctions.build(1);
        assertThat(result, is(notNullValue()));
        assertThat(result.value, is(1));
    }

    @Test
    public void buildShouldReturnTwo() {
        LinkedListNode<Integer> result = ListFunctions.build(1, 2);
        assertThat(result, is(notNullValue()));
        assertThat(result.next.value, is(2));
    }

    @Test
    public void buildShouldReturnOneTwo() {
        LinkedListNode<Integer> list = ListFunctions.build(1, 2);
        String result = ListFunctions.output(list, ",");
        assertThat(result, is(notNullValue()));
        assertThat(result, is("1,2"));
    }

    @Test
    public void buildShouldReturnTwoOne() {
        LinkedListNode<Integer> list = ListFunctions.build(1, 2);
        list = ListFunctions.reverse(list);
        String result = ListFunctions.output(list, ",");
        assertThat(result, is(notNullValue()));
        assertThat(result, is("2,1"));
    }

    @Test
    public void reverseShouldReverseOrder() {
        LinkedListNode<Integer> list = ListFunctions.build(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list = ListFunctions.reverse(list);
        String result = ListFunctions.output(list, ",");
        assertThat(result, is(notNullValue()));
        assertThat(result, is("9,8,7,6,5,4,3,2,1"));
    }
    
    @Test
    public void mthNodeShouldBeEnd()  {
        LinkedListNode<Integer> list = ListFunctions.build(1, 2, 3, 4, 5, 6, 7, 8, 9);
        LinkedListNode<Integer> result = ListFunctions.findMthFromEnd(list, 0);
        assertThat(result.value, is(9));
    }
    
    @Test
    public void mthNodeShouldBeFirst()  {
        LinkedListNode<Integer> list = ListFunctions.build(1, 2, 3, 4, 5, 6, 7, 8, 9);
        LinkedListNode<Integer> result = ListFunctions.findMthFromEnd(list, 8);
        assertThat(result.value, is(1));
    }
    
    @Test
    public void shouldReturnNullWithOneNode()  {
        LinkedListNode<Integer> list = ListFunctions.build(1);
        assertThat(list, is(notNullValue()));
        assertThat(list.next, is(nullValue()));
        LinkedListNode<Integer> result = ListFunctions.deleteElement(list, 1);
        assertThat(result, is(nullValue()));
    }
    
    @Test
    public void shouldReturnNullWithTwoNodes()  {
        LinkedListNode<Integer> list = ListFunctions.build(1, 1);
        assertThat(list, is(notNullValue()));
        assertThat(list.next.next, is(nullValue()));
        LinkedListNode<Integer> result = ListFunctions.deleteElement(list, 1);
        assertThat(result, is(nullValue()));
    }
}
