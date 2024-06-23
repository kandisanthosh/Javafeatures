package com.java8.streams.examples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//3) How do you find frequency of each character in a string using Java 8 streams?

public class FrequencyOfEachCharacter {
	
	public static void main(String[] args) {
		
		 String inputString = "Java Concept Of The Day";
		   Map<Character, Long> charCountMap = 
                   inputString.chars()
                               .mapToObj(c -> (char) c)
                               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
       System.out.println(charCountMap);
	         
	}

}
