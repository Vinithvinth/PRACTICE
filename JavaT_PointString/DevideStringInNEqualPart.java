package JavaT_PointString;

import java.util.Scanner;

public class DevideStringInNEqualPart {

	public static void main(String[] args) {
		String str = "ihthfdsgjbdfisbdsk";
		devideString(str);
		
	}
	private static void devideString(String str) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number of parts to be devided ");
	int N = scan.nextInt();
	int size = str.length();
	if(size%N==0) {
		devideString(str,N);
	}else {
		System.out.println("String can not br divided in to "+N +" parts");
	}
	
	}
	private static void devideString(String str, int N) {
		int z =0;
		for(int i =0; i<str.length();i=i+N) {
			z++;
			System.out.print(z+" part: ");
			for(int j=i; j<N+i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
	}

}
