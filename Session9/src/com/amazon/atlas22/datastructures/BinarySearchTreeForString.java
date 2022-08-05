package com.amazon.atlas22.datastructures;

import com.amazon.atlas22.model.StringNode;

public class BinarySearchTreeForString {
	
	int size;
	StringNode rootNode; 

	public BinarySearchTreeForString(){
		System.out.println("[BinarySearchTreeForString] Created at "+this+" with size: "+size+" and rootNode as "+rootNode);
	}
	
	public StringNode insert(StringNode node, String data) {
		
		
		if(node == null) {
			// Create a new Node Object
			node = new StringNode(data);
			size++; 

			if(size == 1) {
				// Allocate the rootNode
				rootNode = node;
			}
			return node;
		}
		
		if(data.compareTo(node.data) < 0) { // insert in the left
			node.left = insert(node.left, data);			
		}else {				// insert in the right
			node.right = insert(node.right, data);
		}
		
		System.out.println("[BinarySearchTreeForString] [Insert] Node Added: "+node+" and size is: "+size);
		node.showNode();
		
		//lastAddedNode = node;
		return node;
				
	}

	public int getSize() {
		return size;
	}

	public StringNode getRootNode() {
		return rootNode;
	}
	
	public void preOrder(StringNode root) {
		if(root!=null) {
			System.out.print(root.data+" ");  // Print/Visit Root First
			preOrder(root.left);			  // Print/Visit left of the Root
			preOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void inOrder(StringNode root) {
		if(root!=null) {
			inOrder(root.left);			  	  // Print/Visit left of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
			inOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void postOrder(StringNode root) {
		if(root!=null) {
			postOrder(root.left);			  // Print/Visit left of the Root
			postOrder(root.right);			  // Print/Visit right of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
		}
	}
	
}
