package JavaT_pointArrays;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int element=  largestElement(arr);
       System.out.println("the largest element= "+element);
	}

	private static int largestElement(int[] arr) {
		int temp =0;
		for(int i=0;i<arr.length;i++) {
            if(arr[i]>temp) {
            	temp=arr[i];
            }
		}
		return temp;
		
	}


}
