package com.amazon.atlas22.datastructures;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class GenericGraph<T> {

	// HashMap as built in data structure
	LinkedHashMap<T, LinkedList<T>> map; // Which will maintain the order of the key value pair in which they are added
	LinkedHashMap<T, Boolean> visitedVertices;
	
	boolean isDirected;
	
	public GenericGraph() {
		map = new LinkedHashMap<>();
		isDirected = false;
		System.out.println("[Graph] Created...");
	}
	
	public void initializeVisitedVertices() {
		if(visitedVertices == null) {
			visitedVertices = new LinkedHashMap<>();
		}else {
			visitedVertices.clear();
		}
	}
	
	// Adding a Vertex in the HashMap and initializing its value as a new LinkedList which shall be an Adj List
	private void addVertex(T vertex) {
		map.put(vertex, new LinkedList<>());
	} 
	
	public void setIsDirected() {
		isDirected = true;
	}
	
	public void addEdge(T vertext1, T vertext2) {
		
		System.out.println("[Graph] Adding Edge: "+vertext1+"<------>"+vertext2);
		
		if(!map.containsKey(vertext1)) {
			addVertex(vertext1);
		}
		
		if(!map.containsKey(vertext2)) {
			addVertex(vertext2);
		}
		
		// Obtain the Adj List of the vertext1 and add vertex2 inside it :)
		map.get(vertext1).add(vertext2);
		
		if(!isDirected)
			// In Case Graph is undirected, add other way around as well :)
			map.get(vertext2).add(vertext1);
	}
	
	public void printAdjList() {
		
		for(T key : map.keySet()) { // Get the Keys and Iterate in them
			LinkedList<T> adjList = map.get(key);
			
			System.out.println("-------------------");
			System.out.println("Adj List of "+key);
			for(T vertex : adjList) {
				System.out.println(vertex);
			}
			
			System.out.println("-------------------");
			System.out.println();
			
		}
		
	}
	
	public int vertices() {
		return map.size();
	}
	
	public void dfs(T vertex) {		
		
		visitedVertices.put(vertex, true);
		System.out.println(vertex);
		
		// Iterating in the Adj List :)
		// When, the vertex is 0, its Adj List is: 1 2 3 
		for(T adjVertex : map.get(vertex)) { // initially, we are capturing adj list of 0
			// Condition: When to Stop recursive loop :)
			if (!visitedVertices.containsKey(adjVertex))
				dfs(adjVertex);
		}		
		
	}
	
	public void bfs(T vertex) {

		visitedVertices.put(vertex, true);
		LinkedList<T> queue = new LinkedList<T>();
		
		// initially, we are adding the first vertex and 0 in our case
		queue.add(vertex);
	
		while(queue.size() != 0) {
			
			vertex = queue.poll();
			System.out.println(vertex);
			
			// Fetch the Adjacent List of the Vertex and add them in the Queue
			// Validation -> Vertex to be added in the queue must not be visited :)
			for(T adjVertex : map.get(vertex)) {
				// Check if the vertex is already visited, do not re visit 
				if(!visitedVertices.containsKey(adjVertex)) {
					visitedVertices.put(adjVertex, true);
					queue.add(adjVertex);
				}
			}
		}
		
	}
	
	
	
}
