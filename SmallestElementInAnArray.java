package JavaT_pointArrays;

public class SmallestElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {-1, 2, 3, 4, -10, 6, 7, 8, 9};
		int element=  smalestElement(arr);
       System.out.println("the smallest element= "+element);
	}

	private static int smalestElement(int[] arr) {
		int temp =arr[0];
		for(int i=0;i<arr.length;i++) {
            if(arr[i]<temp) {
            	temp=arr[i];
            }
		}
		return temp;
		
	}


}
