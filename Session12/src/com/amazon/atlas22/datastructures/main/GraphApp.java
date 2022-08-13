package com.amazon.atlas22.datastructures.main;

import com.amazon.atlas22.datastructures.Graph;

public class GraphApp {

	public static void main(String[] args) {
		
		
		Graph graph = new Graph(6);
		graph.setIsDirected();
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		
		System.out.println();
		graph.printAdjMatrix();
		
		System.out.println();
		graph.printAdjList();
		
		System.out.println();
		graph.printEdgeList();
		
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Spanning Tree with [DFS] Approach");
		graph.initializeVisitedVertices();
		graph.dfs(0);
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Spanning Tree with [BFS] Approach");
		graph.initializeVisitedVertices();
		graph.bfs(0);

	}

}
