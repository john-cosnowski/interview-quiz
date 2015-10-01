package net.cosnowski.interviewquiz.tree;

import java.util.LinkedList;
import java.util.function.Consumer;

public class TreeTraversal {

    public static <T extends Comparable<T>> void inOrder(TreeNode<T> root, Consumer<T> visitor)  {
        if (root == null)  {
            return;
        }
        inOrder(root.left, visitor);
        visitor.accept(root.value);
        inOrder(root.right, visitor);
    }

    public static <T extends Comparable<T>> void preOrder(TreeNode<T> root, Consumer<T> visitor)  {
        if (root == null)  {
            return;
        }
        preOrder(root.left, visitor);
        preOrder(root.right, visitor);
        visitor.accept(root.value);
    }

    public static <T extends Comparable<T>> void breadthFirst(TreeNode<T> root, Consumer<T> visitor)  {
        if (root == null)  {
            return;
        }
        LinkedList<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())  {
            TreeNode<T> next = queue.remove();
            visitor.accept(next.value);
            if (next.left != null)  {
                queue.add(next.left);
            }
            if (next.right != null)  {
                queue.add(next.right);
            }
        }
    }
}
