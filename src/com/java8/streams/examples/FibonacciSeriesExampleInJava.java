package com.java8.streams.examples;

public class FibonacciSeriesExampleInJava {

	
	public static void main(String[] args) {
	     int n=10;  //number of elements in series.
         generateFibonacciSeries(n);
	}

	private static void generateFibonacciSeries(int n) {

		int first=0;
		int second=1;
		int temp;
        System.out.print("FibonacciSeries: "+ first+" "+second+" ");
		for (int i=0;i< n; i++) {
			
			temp=first+second;
			first=second;
			second=temp;
			  System.out.print(temp+" ");
		}
	}
}
