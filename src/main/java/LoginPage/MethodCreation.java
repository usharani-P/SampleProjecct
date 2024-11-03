package LoginPage;

public class MethodCreation {
	
	public void method11() {
		
		//calling  non static method - another class
		Class2 obj = new Class2();
		obj.method21();
		
		
		//Calling static method - another class
		Class2.method22();
		
	}
	
	public static void method12(){
		
		//calling non static method - another class
		Class2 obj = new Class2();
		obj.method21();
		
		//Calling static method - another class
				Class2.method22();
		
	}
	
   
   }

 class Class2{
	
	public void method21(){
		
	}
	
	public static void method22() {
		
	}
}

