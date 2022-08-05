package com.amazon.atlas22.datastructures;

import com.amazon.atlas22.model.Node;

public class BinarySearchTree {
	
	int size;
	Node rootNode; 
	//Node lastAddedNode;

	public BinarySearchTree(){
		System.out.println("[BinarySearchTree] Created at "+this+" with size: "+size+" and rootNode as "+rootNode);
	}
	
	public Node insert(Node node, int data) {
		
		
		if(node == null) {
			// Create a new Node Object
			node = new Node(data);
			size++; 

			if(size == 1) {
				// Allocate the rootNode
				rootNode = node;
			}
			return node;
		}
		
		if(data<node.data) { // insert in the left
			node.left = insert(node.left, data);			
		}else {				// insert in the right
			node.right = insert(node.right, data);
		}
		
		System.out.println("[BinarySearchTree] [Insert] Node Added: "+node+" and size is: "+size);
		node.showNode();
		
		//lastAddedNode = node;
		return node;
				
	}

	public int getSize() {
		return size;
	}

	public Node getRootNode() {
		return rootNode;
	}
	
	public void printLeaves(Node root) {
		if(root!=null) {
			if(root.left == null && root.right == null) {
				System.out.print(root.data+" "); 
			}// Print/Visit Root First
			printLeaves(root.left);			  // Print/Visit left of the Root
			printLeaves(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" "); // Print/Visit Root First
			preOrder(root.left);			  // Print/Visit left of the Root
			preOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void inOrderWithoutRecursion(Node root) {
		//....
	}
	
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);			  	  // Print/Visit left of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
			inOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	public void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);			  // Print/Visit left of the Root
			postOrder(root.right);			  // Print/Visit right of the Root
			System.out.print(root.data+" ");  // Print/Visit Root First
		}
	}
	
	// Search in Tree :)
	public Node search(Node root, int data) {
		
		if(root == null || root.data == data) {
			return root;
		}
		
		if(root.data > data) { // Search Left
			return search(root.left, data);
		}
		
		// Otherwise Search in the right
		return search(root.right, data);
		
	}
	
	// Iterate in the left subtree
	public int minimum(Node root) {
		int min = root.data;
		
		Node temp = root;
		
		while(temp.left != null) {
			min = temp.left.data;
			temp = temp.left;
		}
		
		return min;
	}
	
	// Iterate in the right subtree
	public int maximum(Node root) {
		int max = root.data;
		
		Node temp = root;
		
		while(temp.right != null) {
			max = temp.right.data;
			temp = temp.right;
		}
		
		return max;
	}
	
	// returns the node after deletion :)
	public Node delete(Node rootNode, int data){
		Node node = deleteNode(rootNode, data);
		return node;
	}
	
	Node deleteNode(Node rootNode, int data) {
		
		/*
		// Base Condition for Recursion
		if(rootNode == null) {
			return rootNode;
		}
		
		if(data < rootNode.data) { 			// we need to look up in the left subtree for the element to be deleted
			rootNode.left = deleteNode(rootNode.left, data);
		}else if(data > rootNode.data) {	// we need to look up in the right subtree for the element to be deleted
			rootNode.right = deleteNode(rootNode.right, data);
		}else {								// neither less nor greater, it means we have reached where data will match :)
			// Here we need to delete the data :)
			
			// Logic :)
			// To Delete Leaf Node :)
			if(rootNode.left == null && rootNode.right == null) {
				rootNode = null;
			}
		}
		
		return rootNode;*/
		
		// Base condition for recursion
        if(rootNode == null){
            return  rootNode;
        }
        if (data < rootNode.data){
            // we need to lookup left subtree
        } else if (data > rootNode.data) {
            // we need to lookup right subtree
            rootNode.right=delete(rootNode.right,data);

        }
        else {
            // neither less nor greater, it means we have reached where data will match :)
            // Here we need to delete the data :)
            // Logic :)
            if(rootNode.left == null)
                return rootNode.right;
            else if (rootNode.right == null) {
                return rootNode.left;
            }

            rootNode.data = minimum(rootNode.right);

            rootNode.right = deleteNode(rootNode.right,rootNode.data);

        }
        return rootNode;
		
	}
	
}
