package com.amazon.atlas22.main;

import com.amazon.atlas22.datastructures.AVLTree;
import com.amazon.atlas22.model.Node;

public class AVLTreeApp {

	public static void main(String[] args) {

		// Visualization -> https://visualgo.net/en/bst
		
		AVLTree tree = new AVLTree();
		
		Node rootNode = tree.insert(null, 20);
		tree.insert(rootNode, 10);
		tree.insert(rootNode, 30);
		tree.insert(rootNode, 40);
		tree.insert(rootNode, 50);
		
		tree.inOrder(rootNode);
		
		
	}

}
