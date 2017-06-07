package cn.org.xiwi.search;

/**
 * 二分查找
 */
public class BinarySearch {
	public static int binarySearch(int[] data, int x) {

		int low = 0;
		int high = data.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (data[mid] < x) {
				low = mid + 1;
			} else if (data[mid] > x) {
				high = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;
	}

	static int arr[] = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

	// Driver method
	public static void main(String[] args) {
		int x = 18; // Element to be searched
		int index = binarySearch(arr, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");
	}
}
