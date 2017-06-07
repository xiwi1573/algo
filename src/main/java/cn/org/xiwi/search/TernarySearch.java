package cn.org.xiwi.search;

/**
 * 三分搜索
 */
public class TernarySearch {
	// A recursive ternary search function. It returns location of x in
	// given array arr[l..r] is present, otherwise -1
	public static int ternarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid1 = l + (r - l) / 3;
			int mid2 = mid1 + (r - l) / 3;

			// If x is present at the mid1
			if (arr[mid1] == x)
				return mid1;

			// If x is present at the mid2
			if (arr[mid2] == x)
				return mid2;

			// If x is present in left one-third
			if (arr[mid1] > x)
				return ternarySearch(arr, l, mid1 - 1, x);

			// If x is present in right one-third
			if (arr[mid2] < x)
				return ternarySearch(arr, mid2 + 1, r, x);

			// If x is present in middle one-third
			return ternarySearch(arr, mid1 + 1, mid2 - 1, x);
		}
		// We reach here when element is not present in array
		return -1;
	}

	static int arr[] = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

	// Driver method
	public static void main(String[] args) {
		int x = 50; // Element to be searched
		int index = ternarySearch(arr, 0, arr.length - 1, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");
	}
}
