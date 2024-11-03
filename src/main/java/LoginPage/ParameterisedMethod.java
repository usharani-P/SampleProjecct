package LoginPage;

public class ParameterisedMethod {
	

	public static void main(String[] args) {
		
		
	//	int a= 10;
		
		ParameterisedMethod obj = new ParameterisedMethod();
		
		obj.employeedetails();
		obj.employeedetails(10, "HM");
	}
	
	
   public void employeedetails() {
	   
	   System.out.println("Employee details entered");
	 	
	 }
	
	public void employeedetails(int empid, String dept) {
		
		System.out.println("emp id= "+ empid + " dept = "+ dept);
		
	}


}



