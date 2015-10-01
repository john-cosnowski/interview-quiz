package net.cosnowski.interviewquiz.tree;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BinarySearchTreeTests {

    @Test
    public void shouldFillInPath()  {
        Integer[] elements = {10, 5, 15, 12, 4, 7, 17, 11, 13};
        TreeNode<Integer> testObj = BinarySearchTree.build(elements);
        List<TreeNode<Integer>> nodes = new ArrayList<>();
        boolean found = BinarySearchTree.pathToNode(nodes, testObj, 13);
        assertThat(found, is(true));
        assertThat(nodes.size(), is(4));
    }
}
