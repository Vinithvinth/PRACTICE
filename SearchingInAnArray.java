package JavaT_pointArrays;

public class SearchingInAnArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int target = 20;
		int ans = searchingTarget(arr, target);
		if(ans ==-1) {
			System.out.println("Target is not found in Array");
		}else {
			System.out.println("Target is found At "+ans+" Position");
		}
	}

	private static int searchingTarget(int[] arr, int target) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==target) {
				return ++i;
			}
		}
		return -1;
	}

}
