package com.tinymood.leetcode;

public class SymmetricTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode lchild = new TreeNode(2);
		//TreeNode rchild = new TreeNode(2);
		root.left = lchild;
		//root.right = rchild;
		System.out.println(new SymmetricTree().isSymmetric(root));
	}
	
	public boolean isSymmetric(TreeNode root) {
		return root==null || isSymmetricHelp(root.left,root.right);
	}
	
	private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
		if (left==null || right==null) 
			return left==right;
		if (left.val!=right.val)
			return false;
		return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
}
