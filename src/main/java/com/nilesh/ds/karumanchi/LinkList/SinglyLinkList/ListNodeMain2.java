package com.nilesh.ds.karumanchi.LinkList.SinglyLinkList;

public class ListNodeMain2 {
    public void CodeToCallInMain(String[] args) {
        ListNodeOperations2 listNodeOperations = new ListNodeOperations2();

        //build List
//        ListNode head = listNodeOperations.buildList();
//        //System.out.println("Length is: " + listNodeOperations.printListAndReturnLength(head));
//        listNodeOperations.printListInteractive(head);

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

//        //merge two sorted LinkLists
//        ListNode a = listNodeOperations.buildlistFromArray(Arrays.asList(1, 3, 5));
//        ListNode b = listNodeOperations.buildlistFromArray(Arrays.asList(2, 4, 6, 7));
//        listNodeOperations.printListInteractive(listNodeOperations.mergeTwoSortedList(a, b));
//
        //reverse LinkList in pairs
//        ListNode head = listNodeOperations.buildlistFromArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        listNodeOperations.printListInteractive(head);
//        listNodeOperations.printListInteractive(listNodeOperations.reverseLinkListInPairs(head, 3));

        //make circular link list
//        ListNode head = listNodeOperations.createCircularLinkListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
//        listNodeOperations.findLoopInLinkList(listNodeOperations.buildlistFromArray(Arrays.asList(1,2,3,4,5)));

        //josephus problem
        ListNode2 head = listNodeOperations.createCircularLinkListFromArray(new int[]{1, 2, 3, 4, 5});
        listNodeOperations.josephusCircleProblem(head, 3);
    }
}

