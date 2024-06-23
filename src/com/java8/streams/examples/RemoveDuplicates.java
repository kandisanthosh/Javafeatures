package com.java8.streams.examples;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		 Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python").stream().distinct().forEach(e->System.out.println(e));
		 
	
	}

}
