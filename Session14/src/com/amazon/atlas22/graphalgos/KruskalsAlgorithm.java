package com.amazon.atlas22.graphalgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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


public class KruskalsAlgorithm {
	
	// Consider the ArrayLists as Graph :)
	ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	ArrayList<Edge> edges = new ArrayList<Edge>();
	ArrayList<HashSet<Vertex>> subsets = new ArrayList<HashSet<Vertex>>();
	
	// Merges the 2 Vertices :)
	// S1_V0 = {0};
	// S2_V1 = {1};
	// S1_V0 = {0, 1};
	// S2_V1 = {};
	void union(int v1, int v2) {
		
		HashSet<Vertex> set1 = subsets.get(v1);
		HashSet<Vertex> set2 = subsets.get(v2);
		
		// Merge all the Vertices from the Set2 in Set1
		for(Vertex vertex : set2) {
			set1.add(vertex);
		}
		
		subsets.remove(v2);
	}
	
	// Returns the Absolute Root of Vertex
	int find(Vertex vertex) {
		
		int absoluteRoot = -1;
		
		for(int idx=0; idx<subsets.size(); idx++) {
			HashSet<Vertex> set = subsets.get(idx);
			
			for(Vertex vtx : set) {
				if(vtx.number == vertex.number) {
					absoluteRoot = idx;
					return absoluteRoot;
				}
			}
			
		}
		
		return absoluteRoot;
	}
	
	KruskalsAlgorithm() {
		
		Vertex v1 = new Vertex(0);
		Vertex v2 = new Vertex(1);
		Vertex v3 = new Vertex(2);
		Vertex v4 = new Vertex(3);
		Vertex v5 = new Vertex(4);
		Vertex v6 = new Vertex(5);
		
		vertices.add(v1);	// 0
		vertices.add(v2);	// 1
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);	// 5
		
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
		
		edges.add(edge1);
		edges.add(edge2);
		edges.add(edge3);
		edges.add(edge4);
		edges.add(edge5);
		edges.add(edge6);
		edges.add(edge7);
		edges.add(edge8);
		edges.add(edge9);
		edges.add(edge10);
		
		
		// For Every Vertex, Let us Create a Set with one element as available in the Set
		  /*
		  
		  S1_V0 = {0};
		  S2_V1 = {1};
		  S2_V2 = {2};
		  S2_V3 = {3};
		  S2_V4 = {4};
		  S2_V5 = {5};
		  */
		for(int idx=0; idx<vertices.size(); idx++) {
			HashSet<Vertex> set = new HashSet<Vertex>();
			set.add(vertices.get(idx));
			subsets.add(set);
		}
		
	}
	
	void runKruskals() {
		
		// Sorted the Edges based on Weights
		Collections.sort(edges);
		
		// Kruskals Algo to detect cycle and find that edge which can be added:)
		for(int idx=0; idx<edges.size(); idx++) {
			Edge edge = edges.get(idx);
			Vertex vtx1 = vertices.get(edge.v1);
			Vertex vtx2 = vertices.get(edge.v2);
			
			int ar1 = find(vtx1);
			int ar2 = find(vtx2);
			
			if(ar1 != ar2) {
				System.out.println("Add the Edge to MST");
				System.out.println(edge);
				union(ar1, ar2);
			}
		}
	}
	

	public static void main(String[] args) {	
		KruskalsAlgorithm algo = new KruskalsAlgorithm();
		algo.runKruskals();
	}

}
