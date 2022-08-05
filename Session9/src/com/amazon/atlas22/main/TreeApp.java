package com.amazon.atlas22.main;

import com.amazon.atlas22.datastructures.BinarySearchTree;
import com.amazon.atlas22.model.Node;

public class TreeApp {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		Node rootNode = tree.insert(null, 15);
		tree.insert(rootNode, 20);
		tree.insert(rootNode, 10);
		tree.insert(rootNode, 12);
		tree.insert(rootNode, 30);
		tree.insert(rootNode, 55);
		tree.insert(rootNode, 80);
		tree.insert(rootNode, 60);
		tree.insert(rootNode, 70);
		tree.insert(rootNode, 40);
		tree.insert(rootNode, 50);
		
		
		System.out.println();
		System.out.println("Tree Size is: "+tree.getSize());
		System.out.println("Root Node in Tree is: "+tree.getRootNode());
		tree.getRootNode().showNode();
		System.out.println();
		
		// Tree Traversal Reference Link: https://algorithm-visualizer.org/brute-force/binary-tree-traversal
		// PreOrder Traversal 
		// 15,10,12,20,30,55,40,50,80,60,70 
		System.out.println("PRE-ORDER TRAVERSAL");
		tree.preOrder(rootNode);
		System.out.println();
		
		// InOrder Traversal
		// 10,12,15,20,30,40,50,55,60,70,80
		System.out.println("IN-ORDER TRAVERSAL");
		tree.inOrder(rootNode);
		System.out.println();
		
		// PostOrder Traversal
		// 12,10,50,40,70,60,80,55,30,20,15
		System.out.println("POST-ORDER TRAVERSAL");
		tree.postOrder(rootNode);
		System.out.println();
		
		
		Node foundNode = tree.search(rootNode, 60);
		if(foundNode != null) {
			System.out.println("FOUND NODE: ");
			foundNode.showNode();
		}else {
			System.err.println("No Data Found :(");
		}
		
		System.out.println("Min Element in Tree is: "+tree.minimum(rootNode));
		System.out.println("Max Element in Tree is: "+tree.maximum(rootNode));

		tree.delete(rootNode, 70);
		
		System.out.println("IN-ORDER TRAVERSAL");
		tree.inOrder(rootNode);
		System.out.println();
		
		System.out.println("POST-ORDER TRAVERSAL");
		tree.postOrder(rootNode);
		System.out.println();
		
		System.out.println("LEAVES");
		tree.printLeaves(rootNode);
		System.out.println();

	}

}
