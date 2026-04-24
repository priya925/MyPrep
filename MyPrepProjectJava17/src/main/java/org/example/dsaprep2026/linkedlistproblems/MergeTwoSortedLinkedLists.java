package org.example.dsaprep2026.linkedlistproblems;

import java.util.List;

public class MergeTwoSortedLinkedLists {

    public static void main(String[] args){

        ListNode n1 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n5 = new ListNode(5);
        n1.next = n3;
        n3.next = n5;
        ListNode head1 = n1;

        ListNode n2 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n6 = new ListNode(6);
        n2.next = n4;
        n4.next = n6;
        ListNode head2 = n2;

        ListNode sortedListHead = mergeLists(head1, head2);
        while(sortedListHead!=null){
            System.out.println(sortedListHead.val);
            sortedListHead = sortedListHead.next;
        }
    }

    static ListNode mergeLists(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                head.next = head1;
                head1 = head1.next;
            } else {
                head.next = head2;
                head2 = head2.next;
            }
            head = head.next;
        }

        if(head1 != null) head.next = head1;
        if(head2 != null) head.next = head2;

        return dummy.next;
    }
}
