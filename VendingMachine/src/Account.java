import java.util.Scanner;
public class Account {
	public String name;
	public int accNo;
	public String acctype;
	public double balance;
	public int age;
	
	
	public void insert() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name:");
	name=sc.next();
	
	System.out.println("Enter the acc no:");
	accNo=sc.nextInt();
	
	System.out.println("Enter the acc type:");
	acctype=sc.next();
	
	System.out.println("Enter the balance:");
	balance=sc.nextDouble();
	
	System.out.println("Enter the age:");
	age=sc.nextInt();
	
	
	
	
	
	
	
}
	public void display() {
		System.out.println("Name:" +name);
		System.out.println("Account no:" +accNo);
		System.out.println("Acc Type:" +acctype);
		System.out.println("Balance now:" +balance);
		System.out.println("Age:" +age);
	}
	
	public void deposit(double despositeam) {
		balance=balance+despositeam;
		System.out.println("updated balance"+balance);
	}
	
	public void widraw(double amount) {
		if((balance-amount)>500) {
			System.out.println("take the money");
			balance=balance-amount;
			System.out.println("updated balance:" +balance);
		}
	}
	
	public void checkBalance() {
		System.out.println("balance after deposit :" +balance);
	}
	
	public static void main(String[] args) {
		Account acc1= new Account();
		acc1.insert();
		acc1.display();
		acc1.checkBalance();
		Scanner sc=new Scanner(System.in);
		System.out.println("widraw amount?");
		int amount=sc.nextInt();
		acc1.widraw(amount);
		
		System.out.println("enter the amount to deposit");
		amount=sc.nextInt();
		acc1.deposit(amount);
		acc1.checkBalance();
		
	}
	
	

	}
