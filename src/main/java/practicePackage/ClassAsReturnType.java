package practicePackage;

public class ClassAsReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAsReturnType obj1= new ClassAsReturnType();
		obj1.method1();
		obj1.method2(obj1.method3());
		obj1.method3();
				
		}
		
	public void method1() {
		int a=10;
		System.out.println(a);
	}
		
		public void method2(ClassAsReturnType obj) {

			
		}
		
		public ClassAsReturnType method3() {
			ClassAsReturnType obj = new ClassAsReturnType();
			return obj;
			
		}

	}


