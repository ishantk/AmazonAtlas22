package com.amazon.atlas22.datastructures;

public class RedBlackTree<K extends Comparable<K>, V> {
	
	// Symbolic Constants
	public static final boolean RED = true;
	public static final boolean BLACK = false;

	// Reference to the Root Node
	Node root; // initially null
	
	// Size of the Tree -> Number of Nodes in the Tree
	int size;
	
	// Internal or Nested Class
	// Defines the structure of Node of a RedBlack Tree
	class Node{
		
		K key;			// Store the Key
		V value;		// Store the Value associated with Key
		
		Node left;		// Left Node
		Node right;		// Right Node
		
		boolean color;	// Color Of Node
		
		int size;		// Size of Tree from the Node

		Node() {
			this(null, null, false, 0);
		}
		
		Node(K key, V value, boolean color, int size) {
			this.key = key;
			this.value = value;
			this.color = color;
			this.size = size;
		}
	}
	
	// To Add Node in RBTree :)
	public void put(K key, V value) {		
		if(key != null && value != null) {
			root = put(root, key, value);
			root.color = BLACK;
		}
	}

	// To Add Node in RBTree :)
	Node put(Node node, K key, V value) {
		
		if(node == null) {
			return new Node(key, value, RED, 1);
		}
		
		int result = key.compareTo(node.key);
		
		if(result<0)			node.left = put(node.left, key, value); 	// Left Node Insertion
		else if (result>0)		node.right = put(node.right, key, value); 	// Right Node Insertion
		else					node.value = value; 						//	Trying to insert the same key again, update the Value
		
		// RB tree Violations
		// Fix Violations
		if(isRed(node.right) && !isRed(node.left))			node = rotateLeft(node);
		if(isRed(node.left) && isRed(node.left.left))		node = rotateRight(node);
		if(isRed(node.left) && isRed(node.right))			flipColors(node);	

		
		System.out.println("NODE PUT FINISEHD :) KEY: "+key+" VALUE: "+value+" COLOR: "+node.color);
		
		return node;
	}
	
	void flipColors(Node node) {
		node.color = !node.color;
		node.left.color = !node.left.color;
		node.right.color = !node.right.color;
	}
	
	// Implement these methods :)
	Node rotateLeft(Node node) {
		
		System.out.println("rotateLeft: "+node.key);
		
		Node x = node.right;
		node.right = x.left;
		x.left = node;
		
		// Update Colors
		x.color = x.left.color;
		x.left.color = RED;
		
		// Update Size
		x.size = node.size;
		node.size = size(node.left) + size(node.right) + 1;
		
		return x;
	}
	
	Node rotateRight(Node node) {
		
		System.out.println("rotateRight: "+node.key);
		
		Node x = node.left;
		node.left = x.right;
		x.right = node;
		
		// Update Colors
		x.color = x.right.color;
		x.right.color = RED;
		
		// Update Size
		x.size = node.size;
		node.size = size(node.left) + size(node.right) + 1;
		
		return x;
	}
	
	public V get(K key) {
		if(key != null) {
			return get(root, key);
		}else {
			return null;
		}
	}
	
	V get(Node node, K key) {
		
		while(node != null) {
			int result = key.compareTo(node.key);
			if(result<0)	node = node.left;	// Search in Left
			if(result>0)	node = node.right;	// Search in Right
			else			return node.value;	// We found the Key :)
		}
		
		return null;
	}
	
	// Utility Methods
	
	// Check RED Color or BLACK Color for the Node
	boolean isRed(Node node) {
		if(node != null) {
			return node.color == RED;
		}else {
			return BLACK;
		}
	}
	
	// Size method, returns the Size of Tree from the Node
	int size(Node node) {
		if(node != null) {
			return node.size;
		}else {
			return 0;
		}
	}
	
	// Size of Tree from Root Node
	int size() {
		return size(root);
	}
	
	// Return Number of Nodes in the Tree
	int totalNodes() {
		return size;
	}
	
	// If the tree is empty or not
	boolean isEmpty() {
		return root == null; // OR size == 0
	}
	
	// Minimum Node
	Node min(Node node) {
		if(node.left == null) {
			return node;
		}else {
			return min(node.left);
		}
	}
	
	// Maximum Node
	Node max(Node node) {
		if(node.right == null) {
			return node;
		}else {
			return max(node.right);
		}
	}
	
	// Get the minimum node's key
	K min() {
		return min(root).key;
	}

	// Get the maximum node's key
	K max() {
		return max(root).key;
	}
}
