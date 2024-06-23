package com.java8.streams.examples;

public class BubbleSort {
	
	
	public int[] array;
	
	public int index;
	
	
	public BubbleSort(int maxSize) {
		array=new int[maxSize];
		index=0;
	}
	
	public void insert(int value) {
		array[index++]=value;		
	}
	
	
	public void bubbleSort() {
		
		int outer,inner;
		
		for(outer=index-1;outer>0;outer--) {
			
			for(inner=0; inner<outer; inner++) {
				
				if(array[inner]>array[inner+1]) 
					swap(inner,inner+1);		
					
			}
			
		}
		
	}
	
	
	private void swap(int pos1, int pos2) {
		
		int temp=array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=temp;		
		
	}

	  /**
     * This method Display Array
     */
    public void display() {
           for (int i = 0; i < index; i++)
                  System.out.print(array[i] + " ");
           System.out.println("");
    }
	public static void main(String[] args) {
		
		BubbleSort bubbleSort=new BubbleSort(5);
		bubbleSort.insert(12);
		bubbleSort.insert(23);
		bubbleSort.insert(4);
		bubbleSort.insert(1);
		bubbleSort.insert(34);
		//bubbleSort.insert(5);
		bubbleSort.bubbleSort();
		
		   System.out.print("Display Array elements after bubble sorting: ");
           bubbleSort.display(); // display Array elements after sortin
	}

}
