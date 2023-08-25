package JavaT_pointArrays;

public class PrintOddNumbersAndEvenNumbersInAnArray {

	public static void main(String[] args) {
	    int arr[] = {1, 2, 1, 3, 4, 5, 3, 5, 2};
	    evenNumber(arr);
	    oddNumber(arr);
	}

	private static void evenNumber(int[] arr) {
		System.out.println("Even numbers are: ");
		for(int i =0;i<arr.length;i++) {
	    	if(arr[i]%2==0) {
	    		System.out.print(arr[i]+" ");
	    	}
	    }
		System.out.println();
		
	}

	private static void oddNumber(int[] arr) {
		System.out.println("The Odd numbers Are: ");
		for(int i =0;i<arr.length;i++) {
	    	if(arr[i]%2==1) {
	    		System.out.print(arr[i]+" ");
	    	}
	    }
	}

}
