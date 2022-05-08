package com.ky7;

/*Implement the method length, which accepts a linked list (head), and returns the length of the list.

        For example: Given the list: 1 -> 2 -> 3 -> 4, length should return 4.

        The linked list is defined as follows:*/

public class FunWithListsLength {
    public static int length(Node head) {
        if(head == null)
            return 0;
        while(head.next != null)
        {
            return 1 + length(head.next);
        }
        return 1;
    }
}

class Node {
    public Object data;
    public Node next;

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Object data) {
        this(data, null);
    }
}
