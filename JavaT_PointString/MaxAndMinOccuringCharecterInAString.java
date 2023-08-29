package JavaT_PointString;

public class MaxAndMinOccuringCharecterInAString {

	public static void main(String[] args) {
		String str = "grass is greener on the other side";
		
		calculateCount(str);
	}

	private static void calculateCount(String str) {
		int temp = 0;
		int temp2 =str.length();
		char ans = ' ';
		char ans2 = ' ';
		
		for(int i=0;i<str.length();i++) {
			int count =0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' ') {
					count++;
				}
			}
				if(count>temp) {
					temp =count;
					ans = str.charAt(i);
				}
				if(count < temp2 && count!=0) {
					temp2 = count;
					ans2 = str.charAt(i);
				}
			}
		System.out.println("the maximum occuring charecter is "+ans +" = "+temp);
		System.out.println("the minimum occuring charecter is "+ans2+" = "+temp2);
		}
		
		
	}


