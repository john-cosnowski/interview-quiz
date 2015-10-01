package net.cosnowski.interviewquiz.tree;

public class TreeNode<T extends Comparable<T>> {
    public final T value;
    public TreeNode<T> right, left;
    
    public TreeNode(T value)  {
        this.value = value;
    }
    
    public static <T extends Comparable<T>> TreeNode<T> newTree(T value)  {
        return new TreeNode<T>(value);
    }
}
