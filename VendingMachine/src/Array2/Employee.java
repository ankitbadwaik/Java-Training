package Array2;

import java.util.Scanner;



public class Employee {
	public int empId;
	public  String name;
	public  double Salary;
	  
	 public void get(){
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
		 for(int i=0;i<3;i++)
		 {
			 obj[i]=new Employee();
			 obj[i].get();
		 }
		 for(int i=0;i<3;i++)
		 {
			 obj[i].showData();
		 }
	}

}
