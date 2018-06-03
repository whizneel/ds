package com.nilesh.ds.LinkList.SinglyLinkList;

public class ListNodeMain {
    public static void main(String[] args) {
        ListNodeOperations listNodeOperations = new ListNodeOperations();

        //build List
        ListNode head = listNodeOperations.buildList();
        //System.out.println("Length is: " + listNodeOperations.printListAndReturnLength(head));
        listNodeOperations.printListInteractive(head);

        //Insertions
//        head = listNodeOperations.insert(head, new ListNode(10), 1);
//        listNodeOperations.printListInteractive(head);
//
//        head = listNodeOperations.insert(head, new ListNode(15), 3);
//        listNodeOperations.printListInteractive(head);
//
//        head = listNodeOperations.insert(head, new ListNode(20), 8);
//        listNodeOperations.printListInteractive(head);
//
//        //deletions
//        head = listNodeOperations.delete(head, 1);
//        listNodeOperations.printListInteractive(head);
//
//        head = listNodeOperations.delete(head, 2);
//        listNodeOperations.printListInteractive(head);
//
//        head = listNodeOperations.delete(head, 6);
//        listNodeOperations.printListInteractive(head);

        //reverse a link List
//        ListNode reverseLinkList = listNodeOperations.reverseLinkList(head);
//        listNodeOperations.printListInteractive(reverseLinkList);

        //printList in reverse
//        listNodeOperations.printLinkListInReverse(head);

        //building a LinkList from array
//        listNodeOperations.printListInteractive(listNodeOperations.buildlistFromArray(Arrays.asList(1,2,3,4,5,6)));

        //merge two sorted LinkLists


    }
}
