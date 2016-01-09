package com.tinymood.leetcode;

//Merge Two Sorted Lists 
public class  MergeTwoLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(4);
		l1.next=l2;
		l2.next=l3;
		
		ListNode s1 = new ListNode(5);
		ListNode s2 = new ListNode(6);
		ListNode s3 = new ListNode(6);
		s1.next=s2;
		s2.next=s3;
		
		ListNode res = new ListNode(0);
		res = mergeTwoLists2(l1, s1);
		
		while (res != null )
		{ 
			System.out.print(res.val+" ");
			res = res.next;
		}
	}
	 
	
	// v1
	public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (null == l1) return l2;
		if (null == l2) return l1;
		
		ListNode head = new ListNode(0);
		ListNode p = head;
		
		while (l1!=null && l2!=null) {
			if (l1.val < l2.val) {
				p.next = l1;
				l1 = l1.next;
			} else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		
		if (l1!=null) p.next = l1;
		else p.next = l2;
		
		return head.next;
	}
}
