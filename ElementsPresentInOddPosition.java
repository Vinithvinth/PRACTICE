package JavaT_pointArrays;

public class ElementsPresentInOddPosition {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 printEven(arr);

	}

	private static void printEven(int[] arr) {
		for(int i=0;i<arr.length;i+=2) {
            System.out.print(arr[i]+" ");
		}
		
	}
}
