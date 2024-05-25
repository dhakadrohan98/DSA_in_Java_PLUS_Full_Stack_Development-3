package com.PreDirectorRound;

import java.util.*;

class Pairr {
	int id;
	String name;

	Pairr(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pairr [id=" + id + ", name=" + name + "]";
	}

}

class Sorting implements Comparator<Pairr> {

	@Override
	public int compare(Pairr s1, Pairr s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class ReverseSortString {

	public static void main(String[] args) {
		List<Pairr> list = new ArrayList<>();
		Pairr p2 = new Pairr(2, "Jakhir");
		Pairr p1 = new Pairr(1, "Akshat");
		Pairr p3 = new Pairr(3, "Zebra");
		Pairr p4 = new Pairr(4, "Rohan");
		list.add(p2);
		list.add(p1);
		list.add(p3);
		list.add(p4);
		System.out.println(list);
		Collections.sort(list, new Sorting());
		System.out.println(list);
	}

}
