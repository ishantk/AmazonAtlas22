package com.amazon.atlas22.datastructures.model;

public class Vertex<T>{
	
	public T vertex;
	public Integer weight;
	
	public Vertex() {
		// TODO Auto-generated constructor stub
	}

	public Vertex(T vertex) {
		this.vertex = vertex;
		weight = 0;
	}
	
	public Vertex(T vertex, Integer weight) {
		this.vertex = vertex;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Vertex [vertex=" + vertex + ", weight=" + weight + "]";
	}
	
}