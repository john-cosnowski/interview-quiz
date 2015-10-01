package net.cosnowski.interviewquiz.list;

public class LinkedListNode<T> {
    
    public final T value;
    
    public LinkedListNode<T> next;
    
    public LinkedListNode(T value)  {
        if (value == null)  {
            throw new IllegalArgumentException();
        }
        this.value = value;
        //  next is initialized to null
    }
}
