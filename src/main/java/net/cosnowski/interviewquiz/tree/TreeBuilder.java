package net.cosnowski.interviewquiz.tree;

import java.util.LinkedList;

public class TreeBuilder {

    @SafeVarargs
    public static <T extends Comparable<T>> TreeNode<T> build(T...elements)  {
        if (elements == null || elements.length == 0)  {
            return null;
        }
        TreeNode<T> root = TreeNode.newTree(elements[0]);
        LinkedList<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < elements.length)  {
            TreeNode<T> next = queue.remove();
            T leftValue = elements[index++];
            if (leftValue != null)  {
                TreeNode<T> left = new TreeNode<T>(leftValue);
                next.left = left;
                queue.add(left);
            }
            if (index < elements.length)  {
                T rightValue = elements[index++];
                if (rightValue != null)  {
                    TreeNode<T> right = new TreeNode<T>(rightValue);
                    next.right = right;
                    queue.add(right);
                }
            }
        }
        return root;
    }
}
