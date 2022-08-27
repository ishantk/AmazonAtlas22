package com.amazon.atlas22.graphalgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Kruskals {
	
	// Consider the ArrayLists as Graph :)
	ArrayList<Vertex> vertices;
	ArrayList<Edge> edges;
	ArrayList<HashSet<Vertex>> subsets = new ArrayList<HashSet<Vertex>>();
	
	private int cost;
	
	Kruskals(Graph graph){
		vertices = graph.getVertexList();
		edges = graph.getEdgeList();
		
		for(int idx=0; idx<vertices.size(); idx++) {
			HashSet<Vertex> set = new HashSet<Vertex>();
			set.add(vertices.get(idx));
			subsets.add(set);
		}
	}
	
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

	Graph runKruskalAlgo() {
		
		ArrayList<Edge> mstEdges = new ArrayList<Edge>();
		
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
				cost += edge.weight;
				mstEdges.add(edge);
				union(ar1, ar2);
			}
		}		
		
		Graph mst = new Graph(vertices, mstEdges);
		return mst;
	}
	
	public int getCost() {
		return cost;
	}
	
}
