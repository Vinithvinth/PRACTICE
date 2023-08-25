package JavaT_pointArrays;

import java.util.Arrays;

public class SortingAnArrayInAscendingOrder {

	public static void main(String[] args) {
		int[] arr = {0, 2, 1};
		//we can use this method to print array elements in ascending order by default
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
        //doing it manually
		for(int i=0;i<arr.length;i++) {
			int min = 0;
			for(int j =i+1; j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					min= arr[i];
					arr[i] = arr[j];
					arr[j]=min;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
