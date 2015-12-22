package com.tinymood.leetcode;

public class RemoveDuplicates2 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(3);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		ListNode res = new ListNode(0);
		res = new RemoveDuplicates2().deleteDuplicates2(l1);
		while (res != null )
		{ 
			System.out.println(res.val);
			res = res.next;
		}
	}
	// normal
	public ListNode deleteDuplicates(ListNode head) {
		if (head==null || head.next==null) return null;
		ListNode p = head, q = head.next;
		while (q!=null) {
			if (p.val==q.val) {
				p.next=q.next;
				q=q.next;
			} else {
				p=p.next;
				q=q.next;
			}
		}
		return head;
	}
	// ตÝน้
	public ListNode deleteDuplicates2(ListNode head) {
		if(head == null || head.next == null) return head;
		head.next=deleteDuplicates2(head.next);
		return head.val==head.next.val?head.next:head;
	}
	
	
	
	
	
	
	
	
	
	
	
}
