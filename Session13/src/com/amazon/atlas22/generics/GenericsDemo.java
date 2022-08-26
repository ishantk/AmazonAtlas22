package com.amazon.atlas22.generics;


class Song{
	
}
/*
class Node{
	
	Integer data;
	Node next;
	Node previous;
	
}

class CharacterNode{
	Character data;
	Node next;
	Node previous;
}

class DoubleNode{
	Double data;
	Node next;
	Node previous;
}

class SongNode{
	
	Song data;
	Node next;
	Node previous;
	
}

*/

/*class Node<T>{
	
	T data;
	Node<T> next;
	Node<T> previous;
	
}*/


class Node<T extends Number>{
	
	T data;
	Node<T> next;
	Node<T> previous;
	
}

public class GenericsDemo {

	public static void main(String[] args) {
		

		Node<Integer> node1 = new Node<Integer>();
		node1.data = 10;
		node1.next = null;
		node1.previous = null;
		
		Node<Integer> node2 = new Node<Integer>();
		node2.data = 20;
		
		node2.previous = node1;
		node1.next = node2;
		
		//Node<Song> node3 = new Node<Song>(); // now this will be error as Song is not the Child of Number :)
		Node<Float> node4 = new Node<Float>();
		Node<Double> node5 = new Node<Double>();
		
		
	}

}
