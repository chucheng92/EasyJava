package com.tinymood.job;

/**
 * 
 * @author 哓哓
 *
 */
public class InsertNode {
	public static void main(String[] args) {
		ListNode a = new ListNode(0);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(2);
		
		a.next = a2;
		a2.next = a3;
		
		insertNode(3, a);
		while (a != null) {
			System.out.print(a.val + " ");
			a = a.next;
		}
	}
	
	public static ListNode insertNode(int index, ListNode l) {
		ListNode p = l;
		int j = 0;
		while (p != null && j < index-1) {
			p = p.next;
			j++;
		}
		
		if (null == p) {
			insertNode(index-1, l);
		} else {
			ListNode q = new ListNode(3);
			q.next = p.next;
			p.next = q;
		}
		return l;
	}
}
