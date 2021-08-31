package Array2;

import java.util.Scanner;



public class Employee {
	 int empId;
	 String name;
	 double Salary;
	
	
	  
	 public void getEmp(){
		  Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Id");
			empId=sc.nextInt();
			System.out.println("Enter the Name");
			name=sc.next();
			System.out.println("Enter the Salary");
			Salary=sc.nextDouble();
			
	  }
	 	
	  
	  
	  
	 public void showData(){
		System.out.println("ID : "+empId);
		System.out.println("Name : "+name);
		System.out.println("salary :"+Salary);
	 }

	public static void main(String[] args) {
		Employee[] obj = new Employee[3] ;
		int i;
		 
		 for(i=0;i<3;i++)
			 obj[i] =  new Employee();   
         for(i=0;i<3;i++)
         {
             System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
             obj[i].getEmp();
         }
         System.out.print("\n Details of Employees \n");
         for(i=0;i<3;i++)
             obj[i].showData();
		
		
		
	}

}
