package cn.org.xiwi.sort;

import java.util.Arrays;

//Java program for implementation of QuickSort
public class QuickSort {
	/*
	 * This function takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places all smaller (smaller
	 * than pivot) to left of pivot and all greater elements to right of pivot
	 */
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] < pivot) {
				i++;
				if (i != j) {
					// swap arr[i] and arr[j]
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println("change1 = " + Arrays.toString(arr) + ",i=" + i + ",j=" + j);
				}
			}
		}

		if ((i + 1) != high) {
			// swap arr[i+1] and arr[high] (or pivot)
			int temp = arr[i + 1];
			arr[i + 1] = arr[high];
			arr[high] = temp;
			System.out.println("change2 = " + Arrays.toString(arr) + ",i=" + (i + 1) + ",j=" + high);
		}
		return i + 1;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be
	 * sorted, low --> Starting index, high --> Ending index
	 */
	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 9, 10, 2, 3, 7, 4, 5 };
		printArray(arr);
		QuickSort.quickSort(arr, 0, arr.length - 1);

		System.out.println("sorted array");
		printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra */