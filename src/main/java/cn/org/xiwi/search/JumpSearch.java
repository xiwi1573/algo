package cn.org.xiwi.search;

/**
 * 跳跃搜索
 * */
public class JumpSearch {
	public static int jumpSearch(int[] data,int x) {
		int length = data.length;
		int step = (int) Math.floor(Math.sqrt(length));
		int step_ = step;
		int pos = 0;
		
		while (data[Math.min(step, length)-1] < x) {
			pos = step;
			step += step_;
			if (pos >= length) {
				return -1;
			}
		}
		
		while (data[pos] < x) {
			pos++;
			if (pos == Math.min(step, length)) {
				return -1;
			}
		}
		
		if (data[pos] == x) {
			return pos;
		}
		
		return -1;
	}
	
	static int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
            24, 33, 35, 42, 47};
	   // Driver method 
    public static void main(String[] args) 
    {
         int x = 18; // Element to be searched
         int index = jumpSearch(arr ,x);
          
         // If element was found
         if (index != -1)
            System.out.println("Element found at index " + index);
         else
            System.out.println("Element not found.");
    }
}
