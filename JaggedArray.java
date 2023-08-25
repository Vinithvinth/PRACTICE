package Array;

public class JaggedArray {

	public static void main(String[] args) {
		//declaration and creation
		int num[][]=new int[5][];//base size is mandatory here(arrays are the fixed size)
		//second array size is additional
		num[0]=new int[3];
		num[1]=new int[4];
		num[2]=new int[2];
		num[3]=new int[1];
		num[4]=new int[5];
		
	//	Array Initialization
//		for (int i=0; i<num.length-1;i++) {
//			for (int j=0;j<num[i].length;j++) {
//				num[i][j]=(int)(Math.random()*10);
       // this is for taking the random numbers and multiply with 10
		//for manually 
				num[0][0] = 10;
				num[0][1] = 10;
				num[0][2] = 10;
				num[1][0] = 10;
				num[1][1] = 10;
				num[1][2] = 10;
				num[1][3] = 10;
			
//			}
//		}
		System.out.println("****************************************");
 // Array traversing
		for(int k=0;k<num.length-1;k++) {
			for(int l=0;l<num[k].length;l++) {
				System.out.print(num[k][l]);
			}
			System.out.println();
		}
		System.out.println("****************************************");
		//this is using enhanced for loop
//        for (int n[]:num) {
//	        for(int m:n) {
//		       System.out.print(m+" ");
//	   }
//	     System.out.println();
//}
	}

}
