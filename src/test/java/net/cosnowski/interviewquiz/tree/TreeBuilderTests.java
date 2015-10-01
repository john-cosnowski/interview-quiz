package net.cosnowski.interviewquiz.tree;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TreeBuilderTests {

    @Test
    public void shouldCreateSingleNode()  {
        Integer[] elements = {5};
        TreeNode<Integer> result = TreeBuilder.build(elements);
        assertThat(result, is(notNullValue()));
        assertThat(result.left, is(nullValue()));
        assertThat(result.right, is(nullValue()));
    }

    @Test
    public void shouldCreateTwoLevels()  {
        Integer[] elements = {5, 4, 6};
        TreeNode<Integer> result = TreeBuilder.build(elements);
        assertThat(result, is(notNullValue()));
        assertThat(result.value, is(5));
        assertThat(result.left, is(notNullValue()));
        assertThat(result.left.value, is(4));
        assertThat(result.right, is(notNullValue()));
        assertThat(result.right.value, is(6));
    }

    @Test
    public void shouldCreateThreeSparseLevels()  {
        Integer[] elements = {5, 4, 6, 2, null, null, 7};
        TreeNode<Integer> result = TreeBuilder.build(elements);
        assertThat(result, is(notNullValue()));
        assertThat(result.value, is(5));
        assertThat(result.left, is(notNullValue()));
        assertThat(result.left.value, is(4));
        assertThat(result.left.left.value, is(2));
        assertThat(result.left.right, is(nullValue()));
        assertThat(result.right, is(notNullValue()));
        assertThat(result.right.value, is(6));
    }
}
