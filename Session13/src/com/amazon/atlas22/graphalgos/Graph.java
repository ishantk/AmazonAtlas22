package com.amazon.atlas22.graphalgos;

import java.util.LinkedList;

public class Graph {
	
	// Number of Vertices in the Graph
	int v; 
	
	// Adjacent Edges
	LinkedList<Edge> edgeList;

	// Adjacent List => Array of LinkedLists :)
	LinkedList<Integer>[] adjList;
	
	boolean isDirected;
	
	boolean[] visitedVertices;
	
	public Graph(int v) {
		this.v = v;
		
		adjList = new LinkedList[v];
		
		edgeList = new LinkedList<Edge>();
		
		isDirected = false;
		
		// Initialize all the LinkedLists
		for(int i=0;i<adjList.length;i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[Graph] Created with "+v+" vertices");
		System.out.println("[Graph] "+v+" Adj Lists");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public void setIsDirected() {
		isDirected = true;
	}
	
	public void addEdge(Edge edge) {
		System.out.println("[Graph] Adding an Edge Between: vertex "+edge.v1+" and vertex "+edge.v2);
		System.out.println(edge.v1+"----["+edge.weight+"]----"+edge.v2);
	
		adjList[edge.v1].add(edge.v2);
		
		if(!isDirected)
			adjList[edge.v2].add(edge.v1);
		
		edgeList.add(edge);
		
	}
	
	public void initializeVisitedVertices() {
		visitedVertices = new boolean[v];
	}
	
	public void printAdjList() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Adj List");
		for(int i=0;i<adjList.length;i++) {
			System.out.print(i+"| ");
			for(int element : adjList[i]) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public LinkedList<Edge> printEdgeList() {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Edge List");
		
		for(Edge edge : edgeList) {
			System.out.println(edge);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// Create a New LinkedList so that we do not touch the Edge List of Original graph
		LinkedList<Edge> edges = new LinkedList<Edge>();
		edges.addAll(edgeList);
		
		return edges;
	}
	
	// https://visualgo.net/en/dfsbfs
	
	public void dfs(int vertex) {
		
		visitedVertices[vertex] = true;
		
		System.out.print(vertex+" ");
		
		// Iterating in the Adj List :)
		// When, the vertex is 0, its Adj List is: 1 2 3 
		for(int adjVertex : adjList[vertex]) { // initially, we are capturing adj list of 0
			// Condition: When to Stop recursive loop :)
			if (!visitedVertices[adjVertex])
				dfs(adjVertex);
		}	
	}

	public void bfs(int vertex) {
	
		visitedVertices[vertex] = true;
		
		// Use Queue Data Structure
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		// Visit the Vertex
		// Enqueue Left Child
		// Enqueue Right Child
		// Continue until the queue is empty :)
		
		// initially, we are adding the first vertex and 0 in our case
		queue.add(vertex);
	
		while(queue.size() != 0) {
			
			vertex = queue.poll();
			System.out.print(vertex+" ");
			
			// Fetch the Adjacent List of the Vertex and add them in the Queue
			// Validation -> Vertex to be added in the queue must not be visited :)
			for(int adjVertex : adjList[vertex]) {
				// Check if the vertex is already visited, do not re visit 
				if(!visitedVertices[adjVertex]) {
					visitedVertices[adjVertex] = true;
					queue.add(adjVertex);
				}
			}
		}
		
	}
	
}
