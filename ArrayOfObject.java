package Array;

class Student {
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public void answer() {
		System.out.println("age: "+age +" name: "+name);
	}
}

public class ArrayOfObject {

	public static void main(String[] args) {
		Student[] s1 = new Student[4];
		s1[0]= new Student(12,"vinni");
		s1[1]= new Student(12,"vivek");
		s1[2]= new Student(12,"buddy");
		s1[3]= new Student(12,"koushik");
		
		
		
		for(Student student:s1) {
			student.answer();
		}
	}

}
