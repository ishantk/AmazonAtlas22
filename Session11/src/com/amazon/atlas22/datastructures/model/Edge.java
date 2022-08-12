package com.amazon.atlas22.datastructures.model;

public class Edge<T>{
	
	public Vertex<T> vertex1;
	public Vertex<T> vertex2;
	public Integer weight;
	
	public Edge() {
		// TODO Auto-generated constructor stub
	}

	public Edge(Vertex<T> vertex1, Vertex<T> vertex2, Integer weight) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [vertex1=" + vertex1 + ", vertex2=" + vertex2 + ", weight=" + weight + "]";
	}
	
}