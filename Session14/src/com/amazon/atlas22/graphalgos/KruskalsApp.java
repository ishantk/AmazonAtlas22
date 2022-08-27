package com.amazon.atlas22.graphalgos;

import java.util.ArrayList;

public class KruskalsApp {

	public static void main(String[] args) {
		
		ArrayList<Vertex> vertices = new ArrayList<Vertex>();
		ArrayList<Edge> edges = new ArrayList<Edge>();

		vertices.add(new Vertex(0));	
		vertices.add(new Vertex(1));	
		vertices.add(new Vertex(2));	
		vertices.add(new Vertex(3));	
		vertices.add(new Vertex(4));	
		vertices.add(new Vertex(5));	
		
		edges.add(new Edge(0, 1, 1));
		edges.add(new Edge(0, 2, 2));
		edges.add(new Edge(1, 2, 3));
		edges.add(new Edge(1, 3, 1));
		edges.add(new Edge(1, 4, 3));
		edges.add(new Edge(1, 4, 3));
		edges.add(new Edge(2, 4, 1));
		edges.add(new Edge(3, 4, 2));
		edges.add(new Edge(3, 5, 4));
		edges.add(new Edge(4, 5, 3));
		
		
		Graph graph = new Graph(vertices, edges);
		
		Kruskals kruskals = new Kruskals(graph);
		Graph mst = kruskals.runKruskalAlgo();
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Cost of MST is: "+kruskals.getCost());
		mst.printEdgeList(); // Edges in MST 

	}

}
