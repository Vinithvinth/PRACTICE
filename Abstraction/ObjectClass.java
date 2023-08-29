package Abstraction;

class Bike{
	String name;
	public void hi() {
		System.out.println("say hi:");
	}
	public String toString() {
		return "hello toString";
	}
}

public class ObjectClass {

	public static void main(String[] args) {
           Bike obj = new Bike();
           obj.name ="vinith";
        System.out.println(obj);
 /* by default to string method is there in object class if i call only obj by 
  * default it will consider like obj.toString() this is the default method in 
  * object class if we dont have the method with the same name of toString()
  * if its there as in our case it will print that value wich is there in our method
  * i.e "hello toString" if you dont mention toString also that is ok because however
  * it will take that method by default 
  * 
  */
        
	}
           
}
