package cn.org.xiwi.search;

/**
 * 指数搜索
 */
public class ExponentialSearch {
	public static int exponentialSearch(int[] data, int x) {

		int length = data.length - 1;
		if (data[0] == x) {
			return 0;
		}

		int i = 1;
		while (i < length && data[i] <= x) {
			i = i * 2;
		}

		return binarySearch(data, i / 2, Math.min(i, length), x);
	}

	// A recursive binary search function. It returns
	// location of x in given array arr[l..r] is
	// present, otherwise -1
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the middle
			// itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it
			// can only be present n left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	static int arr[] = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

	// Driver method
	public static void main(String[] args) {
		int x = 18; // Element to be searched
		int index = exponentialSearch(arr, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");
	}
}
