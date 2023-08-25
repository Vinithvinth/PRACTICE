package Array;

public class CopyingArray {

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		int[] arr2 = new int[arr1.length];
		
		//Array initialization
		for(int i=0;i<arr1.length;i++){
			arr1[i]=(int) (Math.random()*10);
		}
		//printing arr1 elements
		System.out.println("This is normal Array");
		 for(int i = 0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		 System.out.println();
		 //copying of an arr1 to arr2
		 for(int i =0;i<arr1.length;i++) {
			 arr2[i]=arr1[i];
		 }
		 //printing the copied Array
		 System.out.println("This is the copied Array");
		 for(int i = 0;i<arr1.length;i++){
				System.out.print(arr2[i]+" ");
			}
	}

}
