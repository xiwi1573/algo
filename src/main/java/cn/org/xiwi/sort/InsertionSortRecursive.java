package cn.org.xiwi.sort;

import java.util.Arrays;

public class InsertionSortRecursive {
	// Recursive function to sort an array using
	// insertion sort
	public static void insertionSortRecursive(int arr[], int n)
	{
	    // Base case
	    if (n <= 1)
	        return;
	 
	    System.out.println("1: "+Arrays.toString(arr)+","+n);
	    // Sort first n-1 elements
	    insertionSortRecursive( arr, n-1 );
	    System.out.println("2: "+Arrays.toString(arr)+","+n);
	    // Insert last element at its correct position
	    // in sorted array.
	    int last = arr[n-1];
	    int j = n-2;
	 
	    /* Move elements of arr[0..i-1], that are
	      greater than key, to one position ahead
	      of their current position */
	    while (j >= 0 && arr[j] > last)
	    {
	        arr[j+1] = arr[j];
	        System.out.println("--"+arr[j+1]+",j="+j);
	        j--;
	    }
	    arr[j+1] = last;
	}
	
	// A utility function to print an array of size n
	public static void printArray(int arr[], int n)
	{
	    for (int i=0; i < n; i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6};
	    int n = arr.length;
	 
	    insertionSortRecursive(arr, n);
	    printArray(arr, n);
	}
}
