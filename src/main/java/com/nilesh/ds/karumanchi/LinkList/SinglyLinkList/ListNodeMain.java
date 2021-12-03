package com.nilesh.ds.karumanchi.LinkList.SinglyLinkList;

import java.util.Arrays;

public class ListNodeMain {

    public void CodeToBeCalledInMain(String[] args) {
        ////    create singly link list.
        //ListNode head = SinglyLinkListOperations.CreateSinglyLinkList();
        //SinglyLinkListOperations.printLinkList(head);

        ////    Create singly link list from array.
        Integer[] arr1 = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        ListNode head1 = SinglyLinkListOperations.CreateSinglyLinkListFromArray(Arrays.asList(arr1));
        SinglyLinkListOperations.printLinkList(head1);

        ////    Insert in singly link list
        ////    Insert in beginning
        //ListNode head2 = SinglyLinkListOperations.insertInSinglyLinkList(1,0, head1);
        //SinglyLinkListOperations.printLinkList(head2);

        ////    Insert in mid
        //ListNode head3 = SinglyLinkListOperations.insertInSinglyLinkList(5,100,head1);
        //SinglyLinkListOperations.printLinkList(head3);

        ////    Insert in last
        //ListNode head4 = SinglyLinkListOperations.insertInSinglyLinkList(11,1000,head1);
        //SinglyLinkListOperations.printLinkList(head4);

        //// delete in singly link list
        // delete in beginning
        //ListNode head5 = SinglyLinkListOperations.deleteInSinglyLinkList(head1,1);
        //SinglyLinkListOperations.printLinkList(head5);

        // delete in middle
        //ListNode head6 = SinglyLinkListOperations.deleteInSinglyLinkList(head1,3);
        //SinglyLinkListOperations.printLinkList(head6);

        // delete in last
        //ListNode head7 = SinglyLinkListOperations.deleteInSinglyLinkList(head1,8);
        //SinglyLinkListOperations.printLinkList(head7);

        // create circular linkList
        ListNode head8 = SinglyLinkListOperations.createCircularLinkList();
        System.out.println("Is loop present: " + SinglyLinkListOperations.checkLoopInLinkList(head8).toString());


    }
}
