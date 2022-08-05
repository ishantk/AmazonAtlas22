package com.amazon.atlas22.model;

public class TreeNode<T> {
	
	public T data;
	public TreeNode<T> left;
	public TreeNode<T> right;
	
	public TreeNode() {
		this(null);
	}
	
	public TreeNode(T data) {
		System.out.println("[TreeNode] Object Created at "+this+" with data: "+data);
		this.data = data;
		left = null;
		right = null;
	}

	public void showNode() {
		String nodeDetails = "[TreeNode] data=" + data + ", left=" + left + ", right=" + right;
		System.out.println(nodeDetails);
	}
}
