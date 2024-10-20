package LoginPage;

public class CreatingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Local Variables
		
		int a = 10;
		char c = 'b';
		String str = "abc";
		System.out.println(a);
		System.out.println(c);
		System.out.println(str);
		
			

	}
	
	//Non static variables or Class Variables
	
	int a1=  20;
	boolean b1= false;
	String c1="xyz";
	
	
	static int a2=30;
	static String C2= "bcd";
	
	
	public void method1() {
	//calling non static variables	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	//calling static variables
		
		
		System.out.println(a2);
		System.out.println(c2);
		

      }
	public static void method2() {
		//calling non static variables
		
		CreatingVariables obj= new CreatingVariables();
		
		System.out.println(obj.a1);
		System.out.println(obj.b1);
		System.out.println(obj.c1);
		
		//Calling static variables
		
		System.out.println(a2);
		System.out.println(c2);
		
	  }
	

}
