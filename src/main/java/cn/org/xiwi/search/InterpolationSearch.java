package cn.org.xiwi.search;

/**
 * 插补法查找
 */
public class InterpolationSearch {
	public static int interpolationSearch(int data[], int x) {

		int low = 0;
		int high = data.length - 1;

		while (low <= high && x >= data[low] && x <= data[high]) {

			int pos = low + (((high - low) / (data[high] - data[low])) * (x - data[low]));// 核心
																							// 需要加强理解

			if (data[pos] == x) {
				return pos;
			}
			if (data[pos] < x) {
				low = pos + 1;
			} else {
				high = pos - 1;
			}

		}

		return -1;
	}

	static int arr[] = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

	// Driver method
	public static void main(String[] args) {
		int x = 18; // Element to be searched
		int index = interpolationSearch(arr, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");
	}
}
