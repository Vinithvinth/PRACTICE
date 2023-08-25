package JavaT_pointArrays;

public class SumOfAllTheItemsOfAnArray {

	public static void main(String[] args) {
		int[] arr = {-1, 2, 3, 4, -10, 6, 7, 8, 9};
        System.out.println("The sum of the elements is: "+calculateSum(arr));
	}

	private static int calculateSum(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
