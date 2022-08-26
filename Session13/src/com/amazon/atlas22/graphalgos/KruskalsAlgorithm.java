package com.amazon.atlas22.graphalgos;

import java.util.Collections;
import java.util.LinkedList;

/*
 
 
 	For a MST, we will have V-1 Edges in the Graph :)
 	If their are 7 vertices we must have V-1 i.e. 7-1 as 6 edges in MST :)
 	
 	Rule#1: 
 			Sort all the edges of the Graph in Non Decreasing Order of their weight
 	
 	Rule#2: 
 			2.1 Pick the Smallest Edge and add it in a new Graph (New Graph will be eventually containing edges and vetices with minimum cost)
 			2.2 Ensure their is no cycle getting formed while adding the smallest edge
 				if cycle is getting formed, drop that edge
 				else, add the edge
 				
 				To check cycle in a graph we can use BFS or DFS or | Disjoint Set Union and Find
 				
 		Keep on repeating Step2 unless we have V-1 edges in the Graph which is MST
 */


class Kruskals{
	
	
	boolean detectCycle() {
		
		return false;
	}
	
	
	static Graph mst(LinkedList<Edge> sortedEdges) {
		
		Graph mst = new Graph(6);
		// perform the algorithm
		
		
		return mst;
	}
	
}

public class KruskalsAlgorithm {

	public static void main(String[] args) {
	
		Graph graph = new Graph(6);
		
		Edge edge1 = new Edge(0, 1, 1);
		Edge edge2 = new Edge(0, 2, 2);
		Edge edge3 = new Edge(1, 2, 3);
		Edge edge4 = new Edge(1, 3, 1);
		Edge edge5 = new Edge(1, 4, 3);
		Edge edge6 = new Edge(2, 3, 2);
		Edge edge7 = new Edge(2, 4, 1);
		Edge edge8 = new Edge(3, 4, 2);
		Edge edge9 = new Edge(3, 5, 4);
		Edge edge10 = new Edge(4, 5, 3);
		
		graph.addEdge(edge1);
		graph.addEdge(edge2);
		graph.addEdge(edge3);
		graph.addEdge(edge4);
		graph.addEdge(edge5);
		graph.addEdge(edge6);
		graph.addEdge(edge7);
		graph.addEdge(edge8);
		graph.addEdge(edge9);
		graph.addEdge(edge10);
		
		//graph.printAdjList();
		LinkedList<Edge> edges = graph.printEdgeList();
		
		Collections.sort(edges); // Sorted as per the weight in ascending arrangement
		
		for(Edge edge : edges) {
			System.out.println(edge);
		}
		
		
		Graph mst = Kruskals.mst(edges);
		// Should print the Edge List for the MST
		mst.printEdgeList();
		

	}

}
