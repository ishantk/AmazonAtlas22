package com.amazon.atlas22.main;

import com.amazon.atlas22.datastructures.BinarySearchTreeForString;
import com.amazon.atlas22.model.StringNode;

public class StringTreeApp {

	public static void main(String[] args) {
		
		BinarySearchTreeForString tree = new BinarySearchTreeForString();
		
		StringNode rootNode = tree.insert(null, "john");
		tree.insert(rootNode, "fionna");
		tree.insert(rootNode, "sia");
		tree.insert(rootNode, "kim");
		tree.insert(rootNode, "anna");
		tree.insert(rootNode, "dave");
		
		System.out.println();
		System.out.println("TRAVERSING IN-ORDER");
		tree.inOrder(rootNode);

	}

}
