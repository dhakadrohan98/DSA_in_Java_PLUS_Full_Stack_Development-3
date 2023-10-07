package com.kumar.graph;

public class Pair {
	int first;
	int second;
	
	//Parameterized constructor
	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
}
