package JavaT_pointArrays;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {

	public static void main(String[] args) {
		int[] arr = {0, 2, 1};
		
	//sorting array in descending order	
		for(int i =0;i<arr.length;i++) {
			int temp = 0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		System.out.println(Arrays.toString(arr));
	
	for(int i : arr) {
		System.out.print(i+" ");
	}

}
}
