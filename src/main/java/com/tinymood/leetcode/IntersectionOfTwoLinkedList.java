package com.tinymood.leetcode;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.standard.RequestingUserName;

public class IntersectionOfTwoLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(3);

		ListNode s1 = new ListNode(2);
		ListNode s2 = new ListNode(3);
		s1.next = s2;
		s2.next = l1;

		// System.out.println(new
		// IntersectionOfTwoLinkedList().getIntersectionNode1(l1, s1).val);
		System.out.println(new IntersectionOfTwoLinkedList().getIntersectionNode2(l1, s1).val);
	}

	// TwoPointers
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		ListNode a = headA;
		ListNode b = headB;
		while (a != b) {
			a = (a == null ? headB : a.next);
			b = (b == null ? headA : b.next);
		}
		return a;
	}

	// hashset法
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		Set<ListNode> set = new HashSet<>();
		while (headA != null || headB != null) {
			if (headA != null) {
				if (!set.add(headA))
					return headA;
				headA = headA.next;
			}
			if (headB != null) {
				if (!set.add(headB))
					return headB;
				headB = headB.next;
			}
		}
		return null;
	}

	// Brute-force法
	public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		ListNode a = headA;
		ListNode b = headB;
		while (a != null) {
			while (b != null) {
				if (a == b)
					return a;
				else
					b = b.next;
			}
			b = headB;
			a = a.next;
		}
		return null;
	}
}
