package net.cosnowski.interviewquiz.tree;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import net.cosnowski.interviewquiz.util.ConsumerStringBuilder;

public class TreeNodeTests {

    @Test
    public void traverseInOrderTest()  {
        Integer[] elements = {5, 3, 7, 2, 6};
        TreeNode<Integer> testObj = BinarySearchTree.build(elements);
        final ConsumerStringBuilder<Integer> sb = new ConsumerStringBuilder<>();
        TreeTraversal.inOrder(testObj, sb);
        assertThat(sb.toString(), is("2,3,5,6,7"));
    }
    
    @Test
    public void breadthFirstTest()  {
        Integer[] elements = {10, 5, 15, 12, 4, 7, 17, 11, 13};
        TreeNode<Integer> testObj = BinarySearchTree.build(elements);
        final ConsumerStringBuilder<Integer> sb = new ConsumerStringBuilder<>();
        TreeTraversal.breadthFirst(testObj, sb);
        assertThat(sb.toString(), is("10,5,15,4,7,12,17,11,13"));
    }
    
//    @Test
    public void depthFirstTest()  {
        Integer[] elements = {10, 5, 15, 12, 4, 7, 17, 11, 13};
        TreeNode<Integer> testObj = BinarySearchTree.build(elements);
        final StringBuilder sb = new StringBuilder();
        TreeTraversal.preOrder(testObj, 
                (value) -> {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(value);
                }
        );
        assertThat(sb.toString(), is("11,13,4,7,2,17,5,15,10"));
    }
}
