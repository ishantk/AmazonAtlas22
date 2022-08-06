package com.amazon.atlas22.main;

import com.amazon.atlas22.datastructures.RedBlackTree;

public class RedBlackTreeApp {

	public static void main(String[] args) {
		
		RedBlackTree<String, Integer> tree = new RedBlackTree<String, Integer>();
		tree.put("John", 95);
		tree.put("Anna", 75);
		tree.put("Dave", 55);
		tree.put("Sia", 88);
		tree.put("Kim", 75);
	}

}
