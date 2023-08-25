package JavaT_pointArrays;

public class FindThirdGreatestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 6, 4, 7, 2, 9, 10};
		System.out.println("the third greatest element is "+getThirdGreatestElement(arr));
    
	}
//to find the greatest element we arrange th elements in ascending order then we will return 
//Required element
	private static int getThirdGreatestElement(int[] arr) {
		int temp =0;
		for(int i=0;i<arr.length;i++){
		   for(int j=i+1;j<arr.length;j++){
			 if(arr[i]>arr[j]) {
				 temp = arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		  }
		}
		return arr[arr.length-3];
	}

}
