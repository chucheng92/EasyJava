package com.tinymood.leetcode;

public class RemoveNthFromEnd {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		
		l1 = new RemoveNthFromEnd().removeNthFromEnd(l1, 1);
		
		while (l1!=null) {
			System.out.print(l1.val+" ");
			l1 = l1.next;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p = dummy, q=dummy;
		while (n>0) {
			q = q.next;
			n--;
		}
		while (q.next!=null) {
			p = p.next;
			q = q.next;
		}
		p.next = p.next.next;
		return dummy.next;
	}
}
