package HW6;

import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

import java.util.*;

import java.lang.*;

import java.io.FileNotFoundException;

import java.io.FileReader;

class KeywordCounter {

public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {

// Create a list from elements of HashMap
	

	List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

// Sort the list
	

	Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {

public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){

	return (o2.getValue()).compareTo(o1.getValue());

	}
});

// put data from sorted list to hashmap

HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();

	for (Map.Entry<String, Integer> aa : list) {

		temp.put(aa.getKey(), aa.getValue());

}

	return temp;

}


public static void main(String[] args) throws FileNotFoundException

{

	HashMap<String, Integer> map = new HashMap<>();

	Scanner scanin = new Scanner(new FileReader("KeywordCounter.txt"));
//Scanner scanin = new Scanner("KeywordCounter.txt");

	String text = scanin.nextLine();
	
	System.out.println(text);
	System.out.println(" ");

		for (String a : text.split(" ")){

			if (map.containsKey(a)){

				map.put(a, map.get(a) + 1);

			}

			else {

				map.put(a,1);

			}

}

HashMap<String, Integer> map1 = sortByValue(map);

	print(map1);

}

public static void print(Map<String, Integer> map){

	if (map.isEmpty()) {

		System.out.println("map is empty");

}

	else {
		
		System.out.println(map);

		}

	}

}