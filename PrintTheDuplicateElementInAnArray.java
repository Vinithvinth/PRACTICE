package JavaT_pointArrays;

public class PrintTheDuplicateElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,1,5};
		duplicateElement(arr);

	}

	private static void duplicateElement(int[] arr) {
		int[] fr = new int[arr.length];
		int visited =-1;
		for(int i =0;i<arr.length;i++) {
			int count =1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
//			if(count>1) {
//				System.out.println(arr[i]+" is a duplicate element");
			}
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=visited) {
				if(fr[i]>1) {
			       System.out.println(arr[i] +" is a duplicate element");
				}
			}
		}
		
	}

}
