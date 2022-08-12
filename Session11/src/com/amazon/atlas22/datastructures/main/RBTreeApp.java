package com.amazon.atlas22.datastructures.main;

import java.util.TreeMap;

import com.amazon.atlas22.datastructures.RedBlackTree;

class Product implements Comparable<Product>{
	
	@Override
	public int compareTo(Product o) {
		
		return 0;
	}
}

public class RBTreeApp {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		tree.put("John", 80);
		tree.put("Fionna", 70);
		tree.put("Dave", 65);
		tree.put("Anna", 90);
		tree.put("Dave", 77);
		
		System.out.println("Marks for Dave are: "+tree.get("Dave"));
		
		//RedBlackTree<Product, Integer> rbTree1 = new RedBlackTree<Product, Integer>();
		
		RedBlackTree<String, Integer> rbTree = new RedBlackTree<String, Integer>();
		rbTree.put("John", 80);
		rbTree.put("Fionna", 70);
		rbTree.put("Dave", 65);
		rbTree.put("Anna", 90);
		//rbTree.put("Dave", 77);
		
		System.out.println();
		System.out.println("Marks for Dave are: "+rbTree.get("Dave"));

	}

}
