package Array;

public class ArrayDemo {

	public static void main(String[] args) {

		int nums[][] = {
				{10,20,30,40},
				{50,33,23,32},
				{23,32,45,54}	
		};
		
		
//		nums[0][2]=17;
//		nums[1][3]=18;
//		for(int i = 0;i<=2;i++) {
//			for (int j = 0;j<=3;j++) {
//				
//			nums[i][j] = (int)(Math.random()*10);
//				
//			}
//			
//		}
//			
			
		for(int i = 0;i<=2;i++) {
			for (int j = 0;j<=3;j++) {
				System.out.print(" "+nums[i][j]);
			}
			System.out.println();
		}

	}
}

