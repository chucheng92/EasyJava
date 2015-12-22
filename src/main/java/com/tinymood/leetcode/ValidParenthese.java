package com.tinymood.leetcode;

import java.util.Stack;

public class ValidParenthese {
	public static void main(String[] args) {
		String s = "([)])";
		System.out.println(new ValidParenthese().isValid(s));
	}
	
	public boolean isValid(String s) {
		if (s==null || s.length()==1) return false;
		Stack<Character> stack = new Stack<>();
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
				stack.push(s.charAt(i));
			else if (s.charAt(i)==')' && !stack.empty() && stack.peek()=='(')
				stack.pop();
			else if (s.charAt(i)==']' && !stack.empty() && stack.peek()=='[')
				stack.pop();
			else if (s.charAt(i)=='}' && !stack.empty() && stack.peek()=='{')
				stack.pop();
			else {
				return false;
			}
		}
		return stack.empty();
	}
}
