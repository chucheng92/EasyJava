package com.tinymood.job;

/**
 * 链表指定位置插入
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

		insertNode(a, 4);
		while (a != null) {
			System.out.print(a.val + " ");
			a = a.next;
		}
	}

	public static ListNode insertNode(ListNode l, int index) {
		if (0 == index) {
			ListNode q = new ListNode(10);
			q.next = l;
			return q;
		}
			
		ListNode p = l;
		int j = 0;
		while (p.next != null && j < index - 1) {
			p = p.next;
			j++;
		}

		ListNode q = new ListNode(10);
		q.next = p.next;
		p.next = q;

		return l;
	}
}
