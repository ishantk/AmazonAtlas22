package com.amazon.atlas22.datastructures.main;

import com.amazon.atlas22.datastructures.Graph;

public class GraphApp {

	public static void main(String[] args) {
		
		Graph graph = new Graph(7);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		
		graph.addEdge(2, 4);
		
		graph.addEdge(3, 4);
		
		graph.addEdge(4, 5);
		
		graph.addEdge(5, 6);
		
		System.out.println();
		graph.printAdjMatrix();
		
		System.out.println();
		graph.printAdjList();
		
		System.out.println();
		graph.printEdgeList();
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		Graph graph2 = new Graph(6);
		graph2.setIsDirected();
		
		graph2.addEdge(0, 1);
		graph2.addEdge(0, 3);
		graph2.addEdge(1, 2);
		graph2.addEdge(2, 4);
		graph2.addEdge(2, 5);
		graph2.addEdge(3, 4);
		graph2.addEdge(4, 5);
		
		System.out.println();
		graph2.printAdjMatrix();
		
		System.out.println();
		graph2.printAdjList();
		
		System.out.println();
		graph2.printEdgeList();
		

	}

}
