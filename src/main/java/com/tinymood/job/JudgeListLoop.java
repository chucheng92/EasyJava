package com.tinymood.job;

public class JudgeListLoop {
	public static void main(String[] args) {
		ListNode a = new ListNode(0);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(2);
		a.next = a2;
		a2.next = a3;
		a3.next = null;
		
		System.out.println(judgeLoop(a));
	}
	
	// 快慢指针法
	public static boolean judgeLoop(ListNode head) { 
		ListNode p1 = head;
		ListNode p2 = head;
		
		while (p1 != null && p2!= null) {
			p1 = p1.next;
			if (p2.next != null) {
				p2 = p2.next.next;
			} else {
				break;
			}
			if (p1 == p2) {
				return true;
			}
		}
		return false;
	}
}
