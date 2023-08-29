package Abstraction;

abstract class Car{//abstract class
	abstract public void drive();//abstract method
	
	public void playMusic() {//normal method
		System.out.println("music playing");
	}
}
class Tyota extends Car{  //concrete class
	     public void drive() {
		System.out.println("driving");
	}
	     public void horn() {
	    System.out.println("tyota will horn");
	    //we can create normal methods here also
	     }
	
}

public class abstractionDemo {

	public static void main(String[] args) {
//here we can not create object for abstract class 
            Car tyota = new Tyota();
            tyota.drive();
	} 

}
