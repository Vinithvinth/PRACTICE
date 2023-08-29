package JavaT_PointString;

public class CountingCharecterInTheSTring {

	public static void main(String[] args) {
		String name = "Vinith Kumar";
		int count =0;
		for(int i =0; i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("the number of charecter in the string is "+count);
	}

}
