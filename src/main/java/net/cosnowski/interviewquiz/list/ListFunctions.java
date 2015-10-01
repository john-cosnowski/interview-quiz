package net.cosnowski.interviewquiz.list;

public class ListFunctions {

    public static <T> LinkedListNode<T> deleteElement(LinkedListNode<T> head, T value) {
        //  Special case - head of list
        while (head != null && head.value.equals(value))  {
          head = head.next;
        }

        LinkedListNode<T> iter = head;
        while (iter != null && iter.next != null)  {
          if (iter.next.value.equals(value))  {
            iter.next = iter.next.next;
          }
          iter = iter.next;
        }
        return head;
        
    }
    
    /**
     * Find mth from end of list.  When mth is zero, return last node, when mth is one
     * return next to last
     * @param head
     * @param mth
     * @return
     */
    public static <T> LinkedListNode<T> findMthFromEnd(LinkedListNode<T> head, int mth) {
        if (head == null)  {
            throw new IllegalArgumentException();
        }
        LinkedListNode<T> current = head;
        for (int i = 0; i < mth; i++)  {
            if (current.next == null)  {
                return null;
            } else {
                current = current.next;
            }
        }
        while (current.next != null)  {
            current = current.next;
            head = head.next;
        }
        return head;
    }
    
    public static <T> LinkedListNode<T> reverse(LinkedListNode<T> list)  {
        if (list == null)  {
            return null;
        }
        LinkedListNode<T> prev = null;
        LinkedListNode<T> head = list;
        LinkedListNode<T> next = list.next;
        while (next != null)  {
            LinkedListNode<T> nextNext = next.next;
            head.next = prev;
            next.next = head;
            prev = head;
            head = next;
            next = nextNext;
        }
        return head;
    }

    /**
     * Build a linked list with the given elements
     * @param elements
     * @return Head of linked list of elements
     */
    @SafeVarargs
    public static <T> LinkedListNode<T> build(T...elements)  {
        if (elements == null || elements.length == 0)  {
            return null;
        }
        LinkedListNode<T> head = new LinkedListNode<T>(elements[0]);
        LinkedListNode<T> cur = head;
        for (int i = 1; i < elements.length; i++)  {
            LinkedListNode<T> nextElement = new LinkedListNode<T>(elements[i]);
            cur.next = nextElement;
            cur = nextElement;
        }
        return head;
    }
    
    public static <T> String output(LinkedListNode<T> head, String sep)  {
        StringBuilder sb = new StringBuilder();
        while (head != null)  {
            if (sb.length() > 0 && sep != null)  {
                sb.append(sep);
            }
            sb.append(head.value);  // Will toString() if needed
            head = head.next;
        }
        return sb.toString();
    }
}
