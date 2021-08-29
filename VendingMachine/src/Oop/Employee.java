package Oop;
import java.util.*;
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public void setEmployee() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the id");
		id=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the salary");
		salary=sc.nextDouble();
		
	}
	
	public void getEmployee() {
		
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		
	}

	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		obj1.setEmployee();
		obj1.getEmployee();

	}

}
