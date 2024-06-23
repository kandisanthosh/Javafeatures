package com.java8.streams.examples;

public class BinarySearchArray {

	int[] array;
	int index;

	public BinarySearchArray(int maxSize) {
		array = new int[maxSize];
		index = 0;

	}

	   public void insert(int value) {
		   
           int j;
           for (j = 0; j < index; j++)
                  // find position at which value should go
                  if (array[j] > value) // linear search
                        break;
           for (int x = index; x > j; x--)
                  // move bigger elements up
        	   array[x] = array[x - 1];
           array[j] = value; // insert it
           index++; // increment size
    }

	public int binarySearch(int key) {
		
		int low = 0;
		int up = index-1;
		int mid= (low+up)/2;
		
		if(low>up) {
			return index;
			
		}
		
		if(array[mid] == key) {
			return index;
			
		}else 	
		if(array[mid]>key) {
			
			up= mid-1;
			
		}else {
			low= mid+1;
		}
		return mid;
		
		
	}

   public void display() {
          System.out.print("Displaying Array: ");
          for (int i = 0; i < index; i++) {
                 System.out.print(array[i] + " ");
          }

   }
   
	public static void main(String[] args) {
        int maxSize = 10; // Initial size of array
        
        BinarySearchArray bSearchArray = new BinarySearchArray(maxSize);

        bSearchArray.insert(11);
        bSearchArray.insert(22);
        bSearchArray.insert(33);
        bSearchArray.insert(99);
        bSearchArray.insert(55);
        bSearchArray.insert(77);
        bSearchArray.insert(66);
        bSearchArray.insert(88);
        bSearchArray.insert(44);
        bSearchArray.insert(1);

        bSearchArray.display();

        bSearchArray.binarySearch(88); // FOUND
        bSearchArray.binarySearch(-1); // NOT FOUND
        bSearchArray.binarySearch(73); // NOT FOUND
	}

}
