package String_in_java;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(" Vinith");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" Kumar");
		System.out.println(sb);
		
		String str = sb.toString();
		sb.deleteCharAt(2);
		System.out.println(sb);
         sb.insert(0," java");
         System.out.println(sb);
         sb.hashCode();
         System.out.println(sb);
// we can use meny methods like this 
	}

}
