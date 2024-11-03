package LoginPage;

public class ReturnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnClass obj1= new ReturnClass();
		
	// j1.method3(obj1.method2().method4());
		obj1.method3(obj.method4());
		obj1.method3(obj1.method2());
 Class2 objnew=obj1.method2();
 objnew.method4();
  obj1.method2().method4();
 
 				
	}
	
	public String method1() {
		
		String str  = "Hello";
		System.out.println(str);
		return str;
				
	}
	

	public Class2 method2() {
Class2 obj=new Class2();
return obj;
		//turn new Class2();
		
				
	}
	
	public void method3(Class2 obj) {
		
	}
	
	public void method5(ReturnClass obj) {
		
		
	}
	
	class Class2{
		
		public void method4()
		{
			int a =10;
			System.out.println(a);
			
		}
	}
	
}
