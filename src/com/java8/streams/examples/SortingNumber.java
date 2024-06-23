package com.java8.streams.examples;

/**
 * 
 * [12:27 PM] Desaboyina, Vasanthi Given an array of size N containing only 0s,
 * 1s, and 2s; sort the array in ascending order. Example 1: Input: N = 5 arr[]=
 * {0 2 1 2 0} Output:0 0 1 2 2
 */
public class SortingNumber {

	public void sorting(int[] array, int length) {

		int swapelement = 0;
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				swapelement = array[i];
				array[i] = array[i + 1];
				array[i + 1] = swapelement;

				sorting(array, length);

			}

		}
	}

	public static void main(String[] args) {
		SortingNumber sortingNumber = new SortingNumber();
		int[] arraySorting = { 0, 2, 1, 2, 0 };

		sortingNumber.sorting(arraySorting, arraySorting.length);
		for (int i = 0; i < arraySorting.length; i++) {
			System.out.println("elements order" + arraySorting[i]);

		}
		
		//reverse a String
		
			String originalString="abcde"; //String to be reversed
           
           System.out.println("Original String: "+originalString);
           System.out.println("Reversed String: "+reverseString(originalString)); 

	}

	private static String reverseString(String originalString) {
		
		char[] charArray=originalString.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			for (int j = 0; j < charArray.length/2-1; j++) {
				char c = charArray[j];
				char temp=charArray[i];
				charArray[i]=charArray[j];
				charArray[j]=temp;
               
			}
			
		}
		
		return new String(charArray);
	}

}
