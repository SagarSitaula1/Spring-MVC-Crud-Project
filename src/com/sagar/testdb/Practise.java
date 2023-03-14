package com.sagar.testdb;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practise {
	
	public static void main(String[] args) {
		System.out.println(function("rukmanni"));
		
	}
	
	public static Character function(String str) {
		Map<Character,Integer>map = new HashMap<>();
		
		for(char c: str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
			//int count = 0;
		for(char c: str.toCharArray()) {
			if(map.get(c)==2) {
				return c;
			}
		}
		return null;
	}
}
