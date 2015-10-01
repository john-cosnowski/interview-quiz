package net.cosnowski.interviewquiz.tree;

import java.util.List;

public class BinarySearchTree {

    public static <T extends Comparable<T>> TreeNode<T> search(TreeNode<T> root, T value)  {
        if (root == null)  {
            return null;
        }
        int compare = root.value.compareTo(value);
        if (compare == 0)  {
            return root;
        } else if (compare < 0)  {
            return search(root.right, value);
        } else {
            return search(root.left, value);
        }
    }

    public static <T extends Comparable<T>> TreeNode<T> searchIteratively(TreeNode<T> root, T value)  {
        while (root != null)  {
            int compare = root.value.compareTo(value);
            if (compare == 0)  {
                return root;
            } else if (compare < 0)  {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> boolean insert(TreeNode<T> root, T value)  {
        int compare = root.value.compareTo(value);
        if (compare == 0)  {
            return false;
        } else if (compare < 0)  {
            if (root.right == null)  {
                root.right = new TreeNode<T>(value);
                return true;
            } else {
                return insert(root.right, value);
            }
        } else {
            if (root.left == null)  {
                root.left = new TreeNode<T>(value);
                return true;
            } else {
                return insert(root.left, value);
            }
        }
    }

    /**
     * Get the path to the node and fill nodes list.
     * @param nodes
     * @param root root of tree that is binary search
     * @param value
     * @return true if value found
     */
    public static <T extends Comparable<T>> boolean pathToNode(List<TreeNode<T>> nodes, TreeNode<T> root, T value)  {
        boolean found;
        if (root == null)  {
          found = false;
        } else {
            int compare = root.value.compareTo(value);
            if (compare == 0) {
                found = true;
            } else if (compare < 0) {
                found = pathToNode(nodes, root.right, value);
            } else {
                found = pathToNode(nodes, root.left, value);
            }
        }
        if (found)  {
          nodes.add(0, root);
        }
        return found;
        
    }

    @SafeVarargs
    public static <T extends Comparable<T>> TreeNode<T> build(T...values)  {
        if (values == null || values.length == 0)  {
            return null;
        }
        TreeNode<T> root = TreeNode.newTree(values[0]);
        for (int i = 1; i < values.length; i++)  {
            insert(root, values[i]);
        }
        return root;
    }

}
