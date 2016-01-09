package com.tinymood.leetcode;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next=l2;
		l2.next=l3;

		ListNode res = new ReverseLinkedList().reverseList2(l1);
		
		while (res != null )
		{ 
			System.out.print(res.val+" ");
			res = res.next;
		}
	}
	
	//iterative solution
	public ListNode reverseList(ListNode head) {
		ListNode dummy = new ListNode(0);
		while (head!=null) {
			ListNode p = head.next;
			head.next = dummy.next;
			dummy.next = head;
			head = p;
		}
		
		return dummy.next;
	}
	
	public ListNode reverseList2(ListNode head) {
		return recursiveReverseList(head, null);
	}
	//recursive solution
	private ListNode recursiveReverseList(ListNode head, ListNode newHead) {
		if (head == null)
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return recursiveReverseList(next, head);
	}
}
