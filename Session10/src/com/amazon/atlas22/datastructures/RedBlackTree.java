package com.amazon.atlas22.datastructures;

import com.amazon.atlas22.model.Node;

public class RedBlackTree<K, V> {
	
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
		
		// Yet to Code...
		
		return null;
	}
	
	// Implement these methods :)
	Node rotateLeft(Node node) {
		
		return null;
	}
	
	Node rotateRight(Node node) {
		
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
