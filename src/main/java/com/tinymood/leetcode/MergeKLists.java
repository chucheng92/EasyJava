package com.tinymood.leetcode;

import java.util.Arrays;

// Merge k Sorted Lists 
public class MergeKLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists==null || lists.length == 0) return null;
		if (1 == lists.length) return lists[0];
		if (2 == lists.length) return mergeTwoLists(lists[0], lists[1]);
		return mergeTwoLists(mergeKLists(Arrays.copyOfRange(lists, 0, lists.length/2)), mergeKLists(Arrays.copyOfRange(lists, lists.length/2, lists.length)));
	}
	
	
	private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (null == l1) return l2;
		if (null == l2) return l1;
		
		ListNode head = new ListNode(0);
		if (l1.val < l2.val) {
			head = l1;
			l1 = l1.next;
		}
		else {
			head = l2;
			l2=l2.next;
		}
		
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
		if (l1 != null) p.next = l1;
		else p.next = l2;
		
		return head;
	}
}
