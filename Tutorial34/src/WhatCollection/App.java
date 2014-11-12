package WhatCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		System.out.println("What collection to use");
		// Lists
		// elements are indexed, can be sorted, can have duplicate elements, element search is slow
		List<String> l1 = new ArrayList<String>(); // good for adding elements at the end of list
		List<String> l2 = new LinkedList<String>();// good for adding elements at the head of list				
		// Sets
		// elements are not indexed, can be sorted, can not have duplicate elements, element search is fast
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new LinkedHashSet<String>(); // keep the order
		Set<String> s3 = new TreeSet<String>(); // already ordered
		// Maps
		// key,value maps, value search is fast through keys, not optimized for iteration
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		Map<Integer,String> m2 = new LinkedHashMap<Integer,String>(); // preserves the order
		Map<Integer,String> m3 = new TreeMap<Integer,String>();	//already ordered
	}
}
