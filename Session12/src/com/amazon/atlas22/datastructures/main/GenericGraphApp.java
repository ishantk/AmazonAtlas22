package com.amazon.atlas22.datastructures.main;

import com.amazon.atlas22.datastructures.GenericGraph;
import com.amazon.atlas22.datastructures.model.User;

public class GenericGraphApp {

	public static void main(String[] args) {

		// Create a Graph Data Structure of Integers :)
		// https://visualgo.net/en/graphds
		GenericGraph<Integer> graph = new GenericGraph<Integer>();
		graph.setIsDirected();
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		
		graph.addEdge(2, 4);
		
		graph.addEdge(3, 4);
		
		System.out.println();
		graph.printAdjList();
		
		System.out.println();
		System.out.println("DFS for GRAPH...");
		graph.initializeVisitedVertices();
		graph.dfs(0);
		
		System.out.println();
		graph.initializeVisitedVertices();
		System.out.println("BFS for GRAPH...");
		graph.bfs(0);
		
		
		
		System.out.println();
		
		// Create a Graph Data Structure of Users :)
		GenericGraph<User> userGraph = new GenericGraph<User>();
		userGraph.setIsDirected();

		User user0 = new User("0. Sia", "sia@example.com", "9999911111");
		User user1 = new User("1. Kim", "kim@example.com", "9999912345");
		User user2 = new User("2. Leo", "leo@example.com", "9999918877");
		User user3 = new User("3. Mike", "mike@example.com", "8799911877");
		User user4 = new User("4. Dave", "dave@example.com", "8999966111");
		
				
		userGraph.addEdge(user0, user1);
		userGraph.addEdge(user0, user2);
		userGraph.addEdge(user0, user3);
		
		userGraph.addEdge(user1, user3);
		userGraph.addEdge(user1, user4);
		
		userGraph.addEdge(user2, user4);
		
		userGraph.addEdge(user3, user4);
		
		
		System.out.println();
		userGraph.printAdjList();
		
		System.out.println();
		userGraph.initializeVisitedVertices();
		System.out.println("DFS for GRAPH...");
		userGraph.dfs(user0);
		
		System.out.println();
		userGraph.initializeVisitedVertices();
		System.out.println("BFS for GRAPH...");
		userGraph.bfs(user0);
		
		
		
	}

}
