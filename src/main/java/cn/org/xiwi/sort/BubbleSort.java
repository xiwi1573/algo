package cn.org.xiwi.sort;

/**
 * 冒泡排序
 * */
public class BubbleSort {
	public static void bubbleSort(int[] data) {
		int length = data.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (data[j+1] < data[j]) {
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 4, 5, 6 };
		bubbleSort(data);
		for (int i : data) {
			System.out.println(i);
		}
	}
}
