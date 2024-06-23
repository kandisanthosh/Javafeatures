package com.java8.streams.examples;

public class SelectionSortArray {
	
	int[] array;
	int index;
	
	
	public SelectionSortArray(int maxsize) {
		
		array=new int[maxsize];
		index=0;
		
	}
	
	//insert values
	public void insert(int value) {
		array[index++]=value;
		
	}
	//selection Sort 
	public void selectionSort() {
		
		int inner,outer,minimum;
		
		for (outer = 0 ; outer < index - 1 ; outer ++) {
			
			minimum = outer;
			
			for (inner = outer + 1; inner < index; inner ++) {
				
				if(array[inner] < array[minimum]) 
					
					minimum=inner;		
					
				
			}
			swap(outer,minimum);			
			
		}
		
	}
	
	
	
	private void swap(int pos1, int pos2) {
		
		int temp=array[pos1];
		array[pos1] = array[pos2];
		array[pos2]=temp;
		
		
	}
	
	 /**
     * This method Display Array
     */
    public void display()
    {
           for (int i = 0; i < index; i++)
                  System.out.print(array[i] + " ");
           System.out.println("");
    }
 

	public static void main(String[] args) {
		int maxLength=6;
		
		SelectionSortArray selectionSortArray=new SelectionSortArray(maxLength);
		
		selectionSortArray.insert(25);
		selectionSortArray.insert(13);
		selectionSortArray.insert(12);
		selectionSortArray.insert(9);
		selectionSortArray.insert(2);
		selectionSortArray.insert(65);
		
		selectionSortArray.display();
		
		selectionSortArray.selectionSort();
		
		selectionSortArray.display();
		
		
		
	}

}
