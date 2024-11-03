package LoginPage;

public class ReturnTypeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnTypeMethods obj = new ReturnTypeMethods();
		int d=obj.add(5, 4);
		System.out.println(d);
		
		System.out.println(obj.multiply(3, 10));

	}
	
	public int add(int a, int b) {
		int c= a+b;
		return c;
		
	}
	
	public int multiply(int a,int b) {
		int c=a*b;
		return c;
		
	}

}
