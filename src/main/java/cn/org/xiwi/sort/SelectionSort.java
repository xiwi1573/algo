package cn.org.xiwi.sort;

/**
 * 选择排序
 * */
public class SelectionSort {
	public static void selectionSort(int[] data) {
		
		for (int i = 0; i < data.length; i++) {
			
			int min = i;
			for (int j = i; j < data.length; j++) {
				if (data[j] < data[min]) {
					min = j;
				}
			}
			
			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
		
	}
	
	 // Prints the array
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[])
    {
        int arr[] = {64,25,12,22,11};
        SelectionSort.selectionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
