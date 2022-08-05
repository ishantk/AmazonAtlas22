package com.amazon.atlas22.main;

import com.amazon.atlas22.datastructures.Tree;
import com.amazon.atlas22.model.TreeNode;

public class GenericTreeApp {

	public static void main(String[] args) {
		
		Tree<Integer> tree1 = new Tree<Integer>();
		TreeNode<Integer> rootNode1 = tree1.insert(null, 15);
		tree1.insert(rootNode1, 20);
		tree1.insert(rootNode1, 12);
		tree1.insert(rootNode1, 18);
		tree1.insert(rootNode1, 30);
		tree1.insert(rootNode1, 50);

		System.out.println();
		tree1.inOrder(rootNode1);
		System.out.println();
		
		Tree<String> tree2 = new Tree<String>();
		TreeNode<String> rootNode2 = tree2.insert(null, "leo");
		tree2.insert(rootNode2, "anna");
		tree2.insert(rootNode2, "sia");
		tree2.insert(rootNode2, "kim");
		tree2.insert(rootNode2, "dave");
		tree2.insert(rootNode2, "ben");
		
		System.out.println();
		tree2.inOrder(rootNode2);
		System.out.println();
		
		Tree<Float> tree3 = new Tree<Float>();
		Tree<Character> tree4 = new Tree<Character>();
		
	}

}
