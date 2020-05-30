package day31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructures {
	public static void main(String[] args) {	
		String[] nameArr = new String[3];
		// nameArr[2];
		// Array is fixed size collection of data
		// [][][] -> random access by indexes
		
		List<String> nameList = new ArrayList<>(5); 
		// ArrayList is based on array
		// List is dynamic size collection
		
		
		List<String> nameLinkedList = new LinkedList<>();
		// LinkedList implementation
		// Dynamic size
		
		
		// Set does not allow duplicates
		Set<String> nameSet = new HashSet<>();
		// HashSet does not follow any order
		
		Set<String> nameLinked = new LinkedHashSet<>();
		// LinkedHashSet follows insertion order
		
		Set<String> nameTree = new TreeSet<>();
		// Sorted implementation of Set
		
		
		// Key value pair data structure
		Map<Integer, String> nameHashMap = new HashMap<>();
		
		Map<Integer, String> nameHashtable = new Hashtable<>();
		
		Map<Integer, String> nameLinkedMap = new LinkedHashMap<>();
		
		Map<Integer, String> nameTreeMap = new TreeMap<>();
	}
}
