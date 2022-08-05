package com.amazon.atlas22.main;

import com.amazon.atlas22.datastructures.Tree;
import com.amazon.atlas22.model.Product;
import com.amazon.atlas22.model.TreeNode;

public class ProductTreeApp {

	public static void main(String[] args) {
		
		Tree<Product> tree = new Tree<Product>(true);

		TreeNode<Product> rootNode = tree.insert(null, new Product(101, "Water Bottle", 1200));
		tree.insert(rootNode, new Product(201, "Adidas Shoe", 5000));
		tree.insert(rootNode, new Product(756, "Apple iPhone", 80000));
		tree.insert(rootNode, new Product(112, "Apple Macbook", 150000));
		tree.insert(rootNode, new Product(121, "Samsung LED TV", 75000));
		
		tree.inOrder(rootNode);

	}

}
