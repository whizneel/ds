package com.nilesh.ds.karumanchi.LinkList.SinglyLinkList;

import java.util.List;

public class ListNodeOperations2 {

    public ListNode2 buildList() {
        ListNode2 head = new ListNode2(1);
        ListNode2 currentNode = head;
        currentNode.setNext(new ListNode2(2));
        currentNode = head.getNext();
        currentNode.setNext(new ListNode2(3));
        currentNode = head.getNext().getNext();
        currentNode.setNext(new ListNode2(4));
        currentNode = head.getNext().getNext().getNext();
        currentNode.setNext(new ListNode2(5));
        currentNode = head.getNext().getNext().getNext().getNext();
        currentNode.setNext(null);
        return head;
    }

    public ListNode2 buildlistFromArray(List<Integer> list) {
        ListNode2 head = new ListNode2(list.get(0));
        ListNode2 curr = head;
        for (int i = 1; i < list.size(); i++) {
            curr.setNext(new ListNode2(list.get(i)));
            curr = curr.getNext();
        }
        return head;

    }

    public int printListAndReturnLength(ListNode2 head) {
        int length = 0;
        ListNode2 curr = head;
        while (curr != null) {
            System.out.println(curr.getData());
            length++;
            curr = curr.getNext();
        }
        return length;
    }

    public int length(ListNode2 head) {
        int length = 0;
        ListNode2 curr = head;
        while (curr != null) {
            length++;
            curr = curr.getNext();
        }
        return length;
    }

    public void printListInteractive(ListNode2 head) {
        ListNode2 current = head;
        while (current.getNext() != null) {
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }
        System.out.print(current.getData());
        System.out.println("-->NULL");

    }

    public ListNode2 insert(ListNode2 head, ListNode2 nodeToInsert, int pos) {
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
            ListNode2 prevNode = head;
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

    public ListNode2 delete(ListNode2 head, int pos) {
        if (head == null) {
            System.out.println("invalid List");
            return null;
        }
        int length = length(head);
        if (pos < 1 || pos > length) {
            System.out.println("invalid position");
        }
        if (pos == 1) {
            ListNode2 curr = head;
            head = head.getNext();
            curr.setNext(null);
            return head;
        } else {
            ListNode2 curr = head.getNext();
            ListNode2 prev = head;
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
    public ListNode2 reverseLinkList(ListNode2 head) {
        if (head == null) {
            System.out.println("invalid list");
        }
        if (head.getNext() == null) {
            return head;
        }
        ListNode2 p = null;
        ListNode2 q = null;
        while (head != null) {
            q = head.getNext();
            head.setNext(p);
            p = head;
            head = q;
        }
        return p;
    }

    public void printLinkListInReverse(ListNode2 head) {
        if (head.getNext() != null) {
            printLinkListInReverse(head.getNext());
        }
        System.out.println(head.getData());
    }

    public ListNode2 mergeTwoSortedList(ListNode2 a, ListNode2 b) {
        ListNode2 result = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.getData() <= b.getData()) {
            result = a;
            result.setNext(mergeTwoSortedList(a.getNext(), b));
        } else {
            result = b;
            result.setNext(mergeTwoSortedList(a, b.getNext()));
        }
        return result;
    }

    //reverse LinkList in pairs of k
    //1->2->3->4->5->6->7->NULL
    //3->2->1->6->5->4->7->NULL  for k=3
    //2->1->4->3->6->5->7->NULL  for k=2
    public ListNode2 reverseLinkListInPairs(ListNode2 head, int k) {
        ListNode2 current = head;
        ListNode2 prev = null;
        ListNode2 next = null;
        int count = 0;
        while (count < k && current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.setNext(reverseLinkListInPairs(next, k));
        }
        return prev;
    }

    //create circular LinkList from Array
    public ListNode2 createCircularLinkListFromArray(int[] arr) {
        ListNode2 p = new ListNode2(arr[0]);
        ListNode2 q = p;
        for (int j = 2; j < arr.length; j++) {
            p.setNext(new ListNode2(arr[j]));
            p = p.getNext();
        }
        p.setNext(q);
        return q;
    }

    public Boolean findLoopInLinkList(ListNode2 head) {
        ListNode2 slow = head;
        ListNode2 fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                System.out.println("loop present");
                return true;
            }
        }
        System.out.println("loop not present");
        return false;
    }

    public void josephusCircleProblem(ListNode2 head, int m) {
        ListNode2 p = head;
        while (p.getNext() != p) {
            int count = 0;
            while (count < m - 1) {
                p = p.getNext();
                count++;
            }
            p.setNext(p.getNext().getNext());
        }
        System.out.println("last person standing: " + p.getData());
    }


}
