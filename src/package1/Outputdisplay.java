package package1;

public class Outputdisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //load = new Overloadingdemo();
		System.out.println("Now Showing overloading example");
		 OverloadingDemo obj = new OverloadingDemo();
		 
		 //Both the methods are called individually in this code
	       obj.display("Tejju"); //Method with one parameter
	       obj.display("Tejju", 27); //Method with two parameters
	       
	       //The following object is created for both parent and child class for 
	       //method overriding demo
	       Vehicle v = new Vehicle();
	       Car c = new Car();
	       
	       System.out.println("Now Showing overriding example");
	       v.type();
	       c.type();
	}
	

}