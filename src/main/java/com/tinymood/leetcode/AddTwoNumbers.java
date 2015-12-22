package com.tinymood.leetcode;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		l1.next=l2;
		l2.next=l3;
		
		ListNode s1 = new ListNode(5);
		ListNode s2 = new ListNode(6);
		ListNode s3 = new ListNode(6);
		s1.next=s2;
		s2.next=s3;
		
		ListNode res = new ListNode(0);
		res = addTwoNumbers(l1, s1);
		
		while (res != null )
		{ 
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }

}
