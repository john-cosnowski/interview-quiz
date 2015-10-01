package net.cosnowski.interviewquiz.list;

import java.util.HashMap;
import java.util.Map;

public class RandomListNode {
    public Object value;
    public RandomListNode random;
    public RandomListNode next;
    
    public RandomListNode(Object value, RandomListNode random)  {
        this.value = value;
        this.random = random;
    }
    
    public static RandomListNode deepCopy(RandomListNode source)  {
        if (source == null)  {
            return null;
        }
        Map<RandomListNode, RandomListNode> sourceToCopy = new HashMap<>();
        RandomListNode copy = new RandomListNode(source.value, source.random);
        sourceToCopy.put(source, copy);
        RandomListNode sourceIter = source;
        RandomListNode copyIter = copy;
        while (sourceIter.next != null)  {
            RandomListNode copyNextNode = new RandomListNode(sourceIter.next.value, sourceIter.next.random);
            sourceToCopy.put(sourceIter, copyNextNode);
            copyIter.next = copyNextNode;
            copyIter = copyIter.next;
            
        }
        copyIter = copy;
        while (copyIter != null)  {
            copyIter.random = sourceToCopy.get(copyIter.random);
            copyIter = copyIter.next;
        }
        return copy;
    }
}
