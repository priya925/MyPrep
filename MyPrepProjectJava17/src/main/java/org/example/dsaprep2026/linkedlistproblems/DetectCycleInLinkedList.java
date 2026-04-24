package org.example.dsaprep2026.linkedlistproblems;

import java.util.List;

public class DetectCycleInLinkedList {

    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n3;

        System.out.println(detectCycleInLinkedList(n1));

        ListNode reversedLinkedListHead = reverseLinkedList(n1);
        while(reversedLinkedListHead != null){
            System.out.println(reversedLinkedListHead.val);
            reversedLinkedListHead = reversedLinkedListHead.next;
        }
    }


    static boolean detectCycleInLinkedList(ListNode node){
        ListNode left = node;
        ListNode right = node;

        while(right != null && right.next != null){
            left = left.next;
            right = right.next.next;

            if(left == right)
                return true;
        }
        return false;
    }

    static ListNode reverseLinkedList(ListNode head){
        ListNode currentNode = head;
        ListNode previousNode = null;
        while( currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;

    }

}


class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}