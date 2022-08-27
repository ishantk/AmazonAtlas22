package com.amazon.atlas22.graphalgos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
	
	// Number of Vertices in the Graph
	private int v; 
	
	// Edge List
	private ArrayList<Edge> edgeList;
	
	// Vertex List
	private ArrayList<Vertex> vertexList;
	
	// Adjacent List => Array of LinkedLists :)
	private LinkedList<Integer>[] adjList;
	
	private boolean isDirected;
		
	// Graph(V, E)
	public Graph(ArrayList<Vertex> vertexList, ArrayList<Edge> edgeList) {
				
		this.vertexList = vertexList;
		this.edgeList = edgeList;
		
		v = vertexList.size();
		
		adjList = new LinkedList[v];
		
		isDirected = false;
		
		// Initialize all the LinkedLists
		for(int i=0;i<adjList.length;i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[Graph] Created with "+v+" vertices");
		System.out.println("[Graph] "+v+" Adj Lists");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		initGraph();
	}
	
	void initGraph() {
		for(Edge edge : edgeList) {
			addEdge(edge);
		}
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
	
	public void printEdgeList() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Edge List...");
		for(Edge edge : edgeList) {
			System.out.println(edge);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	

	public ArrayList<Vertex> getVertexList() {
		ArrayList<Vertex> list = new ArrayList<Vertex>();
		list.addAll(vertexList);
		return list;
	}


	public ArrayList<Edge> getEdgeList() {
		ArrayList<Edge> list = new ArrayList<Edge>();
		list.addAll(edgeList);
		return list;
	}
	
}
