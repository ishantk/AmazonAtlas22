package com.amazon.atlas22.datastructures.main;

import com.amazon.atlas22.datastructures.WeightedGraph;
import com.amazon.atlas22.datastructures.model.Edge;
import com.amazon.atlas22.datastructures.model.Vertex;

public class WeightedGraphApp {

	public static void main(String[] args) {
		
		// https://visualgo.net/en/graphds
		WeightedGraph<Integer> graph = new WeightedGraph<Integer>();

		Vertex<Integer> vertex0 = new Vertex<Integer>(0);
		Vertex<Integer> vertex1 = new Vertex<Integer>(1);
		Vertex<Integer> vertex2 = new Vertex<Integer>(2);
		Vertex<Integer> vertex3 = new Vertex<Integer>(3);
		Vertex<Integer> vertex4 = new Vertex<Integer>(4);
		Vertex<Integer> vertex5 = new Vertex<Integer>(5);
		Vertex<Integer> vertex6 = new Vertex<Integer>(6);
		
		
		//Edge<Integer> edge0 = new Edge<Integer>(vertex0, vertex1, 50);
		//Edge<Integer> edge1 = new Edge<Integer>(vertex0, vertex2, 60);
		Edge<Integer> edge2 = new Edge<Integer>(vertex1, vertex3, 120);
		Edge<Integer> edge3 = new Edge<Integer>(vertex1, vertex4, 90);
		Edge<Integer> edge4 = new Edge<Integer>(vertex2, vertex5, 50);
		Edge<Integer> edge5 = new Edge<Integer>(vertex3, vertex5, 80);
		Edge<Integer> edge6 = new Edge<Integer>(vertex3, vertex6, 70);
		Edge<Integer> edge7 = new Edge<Integer>(vertex4, vertex6, 40);
		Edge<Integer> edge8 = new Edge<Integer>(vertex5, vertex6, 140);
		
		graph.addEdge(new Edge<Integer>(vertex0, vertex1, 50));
		graph.addEdge(new Edge<Integer>(vertex0, vertex2, 60));
		graph.addEdge(edge2);
		graph.addEdge(edge3);
		graph.addEdge(edge4);
		graph.addEdge(edge5);
		graph.addEdge(edge6);
		graph.addEdge(edge7);
		graph.addEdge(edge8);
		
		System.out.println();
		graph.printEdgeList();
		
		System.out.println();
		graph.printAdjList();
		
		
		System.out.println();
		System.out.println("DIRECTED GRAPH..");
		WeightedGraph<Integer> directedGraph = new WeightedGraph<Integer>();
		directedGraph.setIsDirected();
		
		directedGraph.addEdge(new Edge<Integer>(vertex0, vertex1, 100));
		directedGraph.addEdge(new Edge<Integer>(vertex0, vertex2, 50));
		directedGraph.addEdge(new Edge<Integer>(vertex1, vertex2, 50));
		directedGraph.addEdge(new Edge<Integer>(vertex1, vertex3, 50));
		directedGraph.addEdge(new Edge<Integer>(vertex1, vertex4, 50));
		directedGraph.addEdge(new Edge<Integer>(vertex2, vertex3, 100));
		directedGraph.addEdge(new Edge<Integer>(vertex3, vertex4, 75));
		
		System.out.println();
		directedGraph.printEdgeList();
		
		System.out.println();
		directedGraph.printAdjList();
		
	}

}
