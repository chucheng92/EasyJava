package com.tinymood.leetcode;

public class SameTree {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		TreeNode lchild1 = new TreeNode(2);
		TreeNode rchild1 = new TreeNode(2);
		root1.left = lchild1;
		root1.right = rchild1;
		TreeNode root2 = new TreeNode(1);
		TreeNode lchild2 = new TreeNode(2);
		TreeNode rchild2 = new TreeNode(2);
		root2.left = lchild2;
		root2.right = rchild2;
		System.out.println(new SameTree().isSameTree(root1, root2));
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p==null || q==null)
			return p==q;
		if (p.val!=q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
