package com.nilesh.ds.karumanchi.LinkList.SinglyLinkList;

import java.util.Arrays;
import java.util.List;

public class SinglyLinkListOperations {

    public static ListNode CreateSinglyLinkList() {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        return head;
    }

    public static ListNode CreateSinglyLinkListFromArray(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ListNode head;
        ListNode curr;

        head = new ListNode(list.get(0));
        curr = head;

        for (int i = 1; i < list.size(); i++) {
            curr.setNext(new ListNode(list.get(i)));
            curr = curr.getNext();
        }
        return head;
    }

    public static void printLinkList(ListNode head) {
        if (head == null) {
            System.out.println("linkList does not exist");
        };
        ListNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + "-->");
            current = current.getNext();
        }
        if (current == null) {
            System.out.println("NULL");
        }
    }

    public static int linkListLength(ListNode head){
        if (head == null) return 0;
        ListNode currNode = head;
        int len = 1;
        while(currNode != null){
            currNode = currNode.getNext();
            len ++;
        }
        return len;
    }

    //// Insert in singly link list
    // position should be
    // 1 -> insert at beginning
    // n< length -> insert in middle
    // Length + 1 -> insert at last.
    public static ListNode insertInSinglyLinkList(Integer position, Integer val, ListNode head) {
        int length = linkListLength(head);
        if (val == null || position < 1 || position > length+1){
            System.out.println("Invalid value or position.");
            return head;
        }

        if(head == null){
            return new ListNode(val);
        }

        if(position == 1){
            ListNode newNode = new ListNode(val);
            newNode.setNext(head);
            return newNode;
        }else{
            ListNode prevNode = head;
            int count = 1;
            while(count < position-1){
                prevNode = prevNode.getNext();
                count++;
            }
            ListNode newNode = new ListNode(val);
            newNode.setNext(prevNode.getNext());
            prevNode.setNext(newNode);
        }
        return head;
    }

    //// delete in singly link list
    // delete at position 1
    // delete in middle
    // delete in end
    public static ListNode deleteInSinglyLinkList(ListNode head, Integer position){
        if (head == null){
            System.out.println("nothing to delete.");
            return head;
        }
        int listLength = SinglyLinkListOperations.linkListLength(head);
        if(position < 1 || position > listLength){
            System.out.println("position specified is wrong.");
        }
        if(position == 1){
            ListNode nodetoDelete = head;
            head = head.getNext();
            nodetoDelete = null;
        }else{
            int count = 1;
            ListNode prevNode = head;
            while (count < position-1){
                prevNode = prevNode.getNext();
                count ++;
            }
            ListNode nodeToDelete = prevNode.getNext();
            prevNode.setNext(nodeToDelete.getNext());
            nodeToDelete.setNext(null);
            nodeToDelete = null;
        }
        return head;
    }

    public static ListNode createCircularLinkList(){
        Integer[] arr1 = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        ListNode head = SinglyLinkListOperations.CreateSinglyLinkListFromArray(Arrays.asList(arr1));
        ListNode endNode = head;
        while(endNode.getNext() != null){
            endNode = endNode.getNext();
        }
        endNode.setNext(head);
        return head;
    }

    public static Boolean checkLoopInLinkList(ListNode head){
        if(head == null) return false;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(slowPointer != null && fastPointer != null){
            fastPointer = fastPointer.getNext();
            if(slowPointer == fastPointer){
                return true;
            }
            if(fastPointer == null || fastPointer.getNext() == null || fastPointer.getNext().getNext()== null) return false;
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext();
        }
        return false;
    }

    public static ListNode checkLoopAndRemoveLoop(ListNode head){
        if(head == null) return head;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        Boolean loopExists = false;

        while(slowPointer != null && fastPointer != null){
            fastPointer = fastPointer.getNext();
            if(slowPointer == fastPointer){
                loopExists = true;
            }
            if(fastPointer == null || fastPointer.getNext() == null || fastPointer.getNext().getNext()== null) {
                loopExists = false;
            }
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext();
        }
        return null;
    }
}
