package com.nilesh.ds.karumanchi.LinkList.SinglyLinkList;

public class DLLNode {
    public int value;
    public ListNode next;
    public ListNode prev;

    public DLLNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
