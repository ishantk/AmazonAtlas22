package com.amazon.atlas22.main;

import com.amazon.atlas22.casestudy.Distributor;
import com.amazon.atlas22.datastructures.GenericAVLTree;
import com.amazon.atlas22.model.GenericNode;
import com.amazon.atlas22.model.Product;

public class GenericAVLTreeApp {

	public static void main(String[] args) {
		
		GenericAVLTree<Product> tree = new GenericAVLTree<Product>();

		GenericNode<Product> rootNode = tree.insert(null, new Product(101, "Water Bottle", 2000));
		tree.insert(rootNode, new Product(201, "Adidas Shoe", 1000));
		tree.insert(rootNode, new Product(756, "Apple iPhone", 30000));
		tree.insert(rootNode, new Product(112, "Apple Macbook", 40000));
		tree.insert(rootNode, new Product(121, "Samsung LED TV", 50000));
		
		tree.inOrder(rootNode);
		
		//GenericAVLTree<Distributor> mlmTree = new GenericAVLTree<Distributor>();

	}

}
