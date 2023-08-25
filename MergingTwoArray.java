package JavaT_pointArrays;

import java.util.Arrays;

public class MergingTwoArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int[] brr = {60, 70, 50};
		
		int[] ans = mergeArray(arr, brr);
	//traversing using inbuilt method
		System.out.println(Arrays.toString(ans));
//traversing using enhanced for loop
		for(int a : ans) {
			System.out.print(a+" ");
		}
	}

	private static int[] mergeArray(int[] arr, int[] brr) {
		int length = arr.length+brr.length;
		
		int[] temp = new int[length];
		
		int ref =0;
		
		for(int i =0;i<length;i++) {
			if(i>arr.length-1) {
				temp[i]=brr[ref];
				ref++;
			}else {
				temp[i]=arr[i];
			}
		}
		
		return temp;
	}

}
