package JavaT_pointArrays;

import java.util.Arrays;

public class ElementsOfArrayInReverseOrder {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		int[] reverse = reversrOrder(arr);
        System.out.println(Arrays.toString(reverse));
	}

	private static int[] reversrOrder(int[] arr) {
		int[] r = new int[arr.length];
		int c=0;
		for(int i=arr.length-1;i>=0;i--) {
			r[c]=arr[i];
			c++;
		}
		return r;
	}

}
