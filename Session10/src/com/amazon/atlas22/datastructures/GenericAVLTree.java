package com.amazon.atlas22.datastructures;

import com.amazon.atlas22.model.GenericNode;
import com.amazon.atlas22.model.Node;
import com.amazon.atlas22.model.Product;

public class GenericAVLTree<T> {
	int size;
	GenericNode<T> rootNode; 

	public GenericAVLTree(){
		System.out.println("[GenericAVLTree] Created at "+this+" with size: "+size+" and rootNode as "+rootNode);
	}
	
	public GenericNode<T> insert(GenericNode<T> node, T data) {
		
		if(node == null) {
			// Create a new Node Object
			node = new GenericNode<T>(data);
			size++; 

			if(size == 1) {
				// Allocate the rootNode
				rootNode = node;
			}
			return node;
		}
		
		if(data instanceof Product) {
			
			Product p1 = (Product)data;
			Product p2 = (Product)node.data;
			
			// Work only with unique elements
			if(p1.price < p2.price) { // insert in the left
				node.left = insert(node.left, data);			
			}else if (p1.price > p2.price) {				// insert in the right
				node.right = insert(node.right, data);
			}else {
				return node; // do not add duplicate data :)
			}
		}else if (data instanceof Integer){
			
			int i1 = (Integer)data;
			int i2 = (Integer)node.data;
			
			// Work only with unique elements
			if(i1 < i2) { // insert in the left
				node.left = insert(node.left, data);			
			}else if (i1 > i2) {				// insert in the right
				node.right = insert(node.right, data);
			}else {
				return node; // do not add duplicate data :)
			}
		}else if (data instanceof String){
			
			String s1 = (String)data;
			String s2 = (String)node.data;
			
			// Work only with unique elements
			if(s1.compareTo(s2) < 0) { // insert in the left
				node.left = insert(node.left, data);			
			}else if (s1.compareTo(s2) > 0) {				// insert in the right
				node.right = insert(node.right, data);
			}else {
				return node; // do not add duplicate data :)
			}
		}
		
		
		System.out.println("[AVLTree] [Insert] Node Added: "+node+" and size is: "+size);
		node.showNode();
		
		// Capture the Height from Left and Right and simply add 1 to the height
		// Update the height for the ancestor node: get max height and add 1 :)
		node.height = getMaxHeight(height(node.left), height(node.right)) + 1;
		
		int balance = balanceFactor(node);
		System.out.println("[AVLTree] [Insert] Balance Factor for "+node.data+" is: "+balance);
		
		// Write the 4 Cases in Code so as to perform rotations
		
		
		if(data instanceof Product) {

			// 1. Left Left Case :) 
			if(balance > 1 && ((Product)data).price < ((Product)node.left.data).price) {
				System.out.println("[AVLTree] [Insert] CASE1: Left Left Case | Right Rotation Required");
				// Perform Right rotation
				return rightRotate(node);
			}
			
			// 2. Right Right Case :)
			if(balance < -1 && ((Product)data).price > ((Product)node.right.data).price ) {
				System.out.println("[AVLTree] [Insert] CASE2: Right Right Case | Left Rotation Required");
				// Perform Left rotation
				return leftRotate(node);
			}
			
			// 3. Left Right Case :)
			if(balance > 1 && ((Product)data).price > ((Product)node.left.data).price) {
				System.out.println("[AVLTree] [Insert] CASE2: Left Right Case | Left Rotation > Right Rotation Required");
				// Perform Left rotation and then Right Rotation
				node.left = leftRotate(node.left);
				return rightRotate(node);
			}
			
			// 4. Right Left Case :)
			if(balance < -1 && ((Product)data).price < ((Product)node.right.data).price) {
				System.out.println("[AVLTree] [Insert] CASE2: Right Left Case | Right Rotation > Left Rotation Required");
				// Perform Left rotation and then Right Rotation
				node.right = rightRotate(node.right);
				return leftRotate(node);
			}
			
		}else if(data instanceof Integer) {
			int i1 = (Integer)data;
			int i2 = (Integer)node.data;
			
		}else if(data instanceof String) {
			String s1 = (String)data;
			String s2 = (String)node.data;
			
		}
		
		/*
		// 1. Left Left Case :) 
		if(balance > 1 && data < node.left.data) {
			System.out.println("[AVLTree] [Insert] CASE1: Left Left Case | Right Rotation Required");
			// Perform Right rotation
			return rightRotate(node);
		}
		
		// 2. Right Right Case :)
		if(balance < -1 && data > node.right.data) {
			System.out.println("[AVLTree] [Insert] CASE2: Right Right Case | Left Rotation Required");
			// Perform Left rotation
			return leftRotate(node);
		}
		
		// 3. Left Right Case :)
		if(balance > 1 && data > node.left.data) {
			System.out.println("[AVLTree] [Insert] CASE2: Left Right Case | Left Rotation > Right Rotation Required");
			// Perform Left rotation and then Right Rotation
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		
		// 4. Right Left Case :)
		if(balance < -1 && data < node.right.data) {
			System.out.println("[AVLTree] [Insert] CASE2: Right Left Case | Right Rotation > Left Rotation Required");
			// Perform Left rotation and then Right Rotation
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		*/
		//lastAddedNode = node;
		return node;
				
	}
	
	
	public int getSize() {
		return size;
	}

	public GenericNode<T> getRootNode() {
		return rootNode;
	}
	
	public void inOrder(GenericNode<T> root) {
		if(root!=null) {
			inOrder(root.left);			  	  // Print/Visit left of the Root
			
			if(root.data instanceof Product) {
				((Product)root.data).showProduct();
			}else {
				System.out.print(root.data+" ");  // Print/Visit Root First
			}
			
			inOrder(root.right);			  // Print/Visit right of the Root
		}
	}
	
	// Return height of Tree
	int height(GenericNode<T> node) {
		
		if(node != null) {
			return node.height;
		}
		
		return 0;
	}
	
	int balanceFactor(GenericNode<T> node) {
		if(node == null)
			return 0;
		
		return height(node.left) - height(node.right);
	}
	
	int getMaxHeight(int leftHeight, int rightHeight) {
		int maxHeight = leftHeight > rightHeight ? leftHeight : rightHeight;
		return maxHeight;
	}
	
	GenericNode<T> rightRotate(GenericNode<T> y) {
		
		GenericNode<T> x = y.left;
		GenericNode<T> T2 = x.right;
		
		// Perform Rotation
		x.right = y;
		y.left = T2;
		
		// Update Heights :)
		y.height = getMaxHeight(height(y.left), height(y.right)) + 1;
		x.height = getMaxHeight(height(x.left), height(x.right)) + 1;
		
		// New Root 
		return x;
	}
	
	GenericNode<T> leftRotate(GenericNode<T> x) {

		GenericNode<T> y = x.right;
		GenericNode<T> T2 = y.left;
		
		// Perform Rotation
		y.left = x;
		x.right = T2;
		
		// Update Heights :)
		x.height = getMaxHeight(height(x.left), height(x.right)) + 1;
		y.height = getMaxHeight(height(y.left), height(y.right)) + 1;
		
		return y;
	}
}
