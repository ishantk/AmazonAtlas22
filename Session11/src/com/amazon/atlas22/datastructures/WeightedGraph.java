package com.amazon.atlas22.datastructures;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import com.amazon.atlas22.datastructures.model.Edge;
import com.amazon.atlas22.datastructures.model.Vertex;

public class WeightedGraph<T> {

	// G(V,E)
	LinkedHashMap<Vertex<T>, LinkedList<Vertex<T>>> map; // LinkedHashMap will maintain the order in which we will add key/value pair
	LinkedList<Edge<T>> edgeList;
	
	boolean isDirected;
	
	public WeightedGraph() {
		map = new LinkedHashMap<>();
		edgeList = new LinkedList<>();
		isDirected = false;
		System.out.println("[Graph] Created...");
	}
	

	private void addVertex(Vertex<T> vertex) {
		map.put(vertex, new LinkedList<>());
	} 
	
	public void setIsDirected() {
		isDirected = true;
	}
	
	public void addEdge(Edge<T> edge) {
		
		edgeList.add(edge);
		
		System.out.println("[Graph] Adding Edge: "+edge);
		
		if(!map.containsKey(edge.vertex1)) {
			addVertex(edge.vertex1);
		}
		
		if(!map.containsKey(edge.vertex2)) {
			addVertex(edge.vertex2);
		}
		
		// Obtain the Adj List of the vertext1 and add vertex2 inside it :)		
		map.get(edge.vertex1).add(new Vertex<T>(edge.vertex2.vertex, edge.weight));
		
		if(!isDirected)
			// In Case Graph is undirected, add other way around as well :)
			map.get(edge.vertex2).add(new Vertex<T>(edge.vertex1.vertex, edge.weight));
	}
	
	public void printAdjList() {
		
		for(Vertex<T> key : map.keySet()) { // Get the Keys and Iterate in them
			LinkedList<Vertex<T>> adjList = map.get(key);
			
			System.out.println("-------------------");
			System.out.println("Adj List of "+key);
			for(Vertex<T> vertex : adjList) {
				System.out.println(vertex);
			}
			System.out.println("-------------------");
			System.out.println();	
		}
	}
	
	public void printEdgeList() {
		System.out.println("-------------------");
		System.out.println("Edge List of Graph");
		for(Edge<T> edge : edgeList) {
			System.out.println(edge);
		}
		System.out.println("-------------------");
		System.out.println();
	}
	
	public int vertices() {
		return map.size();
	}
	
}
