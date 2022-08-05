package com.amazon.atlas22.model;

public class StringNode {
	
	public String data;
	public StringNode left;
	public StringNode right;
	
	public StringNode() {
		this("");
	}
	
	public StringNode(String data) {
		System.out.println("[StringNode] Object Created at "+this+" with data: "+data);
		this.data = data;
		left = null;
		right = null;
	}

	public void showNode() {
		String nodeDetails = "[StringNode] data=" + data + ", left=" + left + ", right=" + right;
		System.out.println(nodeDetails);
	}
	
}
