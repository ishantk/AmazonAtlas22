package com.amazon.atlas22.graphalgos;

class Edge implements Comparable<Edge>{
	
	int v1;
	int v2;
	int weight;
		
	Edge(int v1, int v2, int weight){
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge ["+v1+"----["+weight+"]----"+v2+"]";
	}

	@Override
	public int compareTo(Edge edge) {
		
		if(weight == edge.weight) {
			return 0;
		}else if(weight > edge.weight) {
			return 1;
		}else {
			return -1;
		}
		
	}
		
}