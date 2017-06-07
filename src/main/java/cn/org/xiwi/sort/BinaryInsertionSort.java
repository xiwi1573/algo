package cn.org.xiwi.sort;

public class BinaryInsertionSort {
	// A binary search based function to find the position
	// where item should be inserted in a[low..high]
	static int binarySearch(int a[], int item, int low, int high) {
		if (high <= low)
			return (item > a[low]) ? (low + 1) : low;

		int mid = (low + high) / 2;

		if (item == a[mid])
			return mid + 1;

		if (item > a[mid])
			return binarySearch(a, item, mid + 1, high);
		return binarySearch(a, item, low, mid - 1);
	}

	// Function to sort an array a[] of size 'n'
	public static void insertionSort(int a[], int n) {
		int i, loc, j, selected;

		for (i = 1; i < n; ++i) {
			j = i - 1;
			selected = a[i];

			// find location where selected sould be inseretd
			loc = binarySearch(a, selected, 0, j);

			// Move all elements after location to create space
			while (j >= loc) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = selected;
		}
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int a[] = { 37, 23, 0,0, 17, 12, 72, 31, 46, 100, 88, 54 };
		int n = a.length;

		insertionSort(a, n);

		System.out.println("Sorted array: \n");
		for (int i = 0; i < n; i++)
			System.out.print(a[i]+" ");

	}
}
