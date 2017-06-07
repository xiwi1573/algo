package cn.org.xiwi.search;

public class LinerSearch {
	public static int linerSearch(int[] data,int x) {
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
	

	static int arr[] = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

	// Driver method
	public static void main(String[] args) {
		int x = 18; // Element to be searched
		int index = linerSearch(arr, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");
	}
}
