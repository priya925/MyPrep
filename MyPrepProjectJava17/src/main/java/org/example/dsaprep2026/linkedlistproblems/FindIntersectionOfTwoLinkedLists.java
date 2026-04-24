package org.example.dsaprep2026.linkedlistproblems;


public class FindIntersectionOfTwoLinkedLists {

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
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        n2.next = n4;
        n4.next = n6;
        n6.next = n7;
        n7.next =n8;
        n8.next = n9;

        n5.next = n8;

        ListNode head2 = n2;

        ListNode intersectionNode = findIntersectionNode(head1, head2);
        System.out.println(intersectionNode == null ? null : intersectionNode.val);
    }

    static ListNode findIntersectionNode(ListNode head1, ListNode head2){
        ListNode a = head1, b= head2;
        while(a!=b ){
           a = (a==null)? head2 : a.next;
           b = (b==null) ? head1 : b.next;
        }
        return a;
    }
}
