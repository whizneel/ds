package com.nilesh.ds.LinkList.SinglyLinkList;

import java.util.List;

public class ListNodeOperations {

    public ListNode buildList() {
        ListNode head = new ListNode(1);
        ListNode currentNode = head;
        currentNode.setNext(new ListNode(2));
        currentNode = head.getNext();
        currentNode.setNext(new ListNode(3));
        currentNode = head.getNext().getNext();
        currentNode.setNext(new ListNode(4));
        currentNode = head.getNext().getNext().getNext();
        currentNode.setNext(new ListNode(5));
        currentNode = head.getNext().getNext().getNext().getNext();
        currentNode.setNext(null);
        return head;
    }

    public ListNode buildlistFromArray(List<Integer> list) {
        ListNode head = new ListNode(list.get(0));
        ListNode curr = head;
        for (int i = 1; i < list.size(); i++) {
            curr.setNext(new ListNode(list.get(i)));
            curr = curr.getNext();
        }
        return head;

    }

    public int printListAndReturnLength(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.getData());
            length++;
            curr = curr.getNext();
        }
        return length;
    }

    public int length(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.getNext();
        }
        return length;
    }

    public void printListInteractive(ListNode head) {
        ListNode current = head;
        while (current.getNext() != null) {
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }
        System.out.print(current.getData());
        System.out.println("-->NULL");

    }

    public ListNode insert(ListNode head, ListNode nodeToInsert, int pos) {
        if (head == null) {
            System.out.println("head node is null");
            return null;
        }
        int length = length(head);
        if (pos > length + 1 || pos < 1) {
            System.out.println("invalid position");
            return null;
        }
        if (pos == 1) {
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        } else {
            ListNode prevNode = head;
            int count = 1;
            while (count < pos - 1) {
                count++;
                prevNode = prevNode.getNext();
            }
            nodeToInsert.setNext(prevNode.getNext());
            prevNode.setNext(nodeToInsert);
        }
        return head;
    }

    public ListNode delete(ListNode head, int pos) {
        if (head == null) {
            System.out.println("invalid List");
            return null;
        }
        int length = length(head);
        if (pos < 1 || pos > length) {
            System.out.println("invalid position");
        }
        if (pos == 1) {
            ListNode curr = head;
            head = head.getNext();
            curr.setNext(null);
            return head;
        } else {
            ListNode curr = head.getNext();
            ListNode prev = head;
            int count = 1;
            while (count < pos - 1) {
                count++;
                prev = prev.getNext();
                curr = curr.getNext();
            }
            prev.setNext(curr.getNext());
            curr.setNext(null);
            return head;
        }
    }

    //1->2->3->4->5
    //5->4->3->2->1
    public ListNode reverseLinkList(ListNode head) {
        if (head == null) {
            System.out.println("invalid list");
        }
        if (head.getNext() == null) {
            return head;
        }
        ListNode p = null;
        ListNode q = null;
        while (head != null) {
            q = head.getNext();
            head.setNext(p);
            p = head;
            head = q;
        }
        return p;
    }

    public void printLinkListInReverse(ListNode head) {
        if (head.getNext() != null) {
            printLinkListInReverse(head.getNext());
        }
        System.out.println(head.getData());
    }

}
