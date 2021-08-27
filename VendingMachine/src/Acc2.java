
public class Acc2 {
	public double accNo;
	public String name;
	
	public Acc2()
	{
		System.out.println("default constructor");
		accNo=123;
		name="ankit";
	}
	public Acc2(long accno,String nam){
		accNo=accno;
		name=nam;
		System.out.println("parameterized constructor");
		
	}
	public void display() {
		System.out.println("Acc no:"+accNo);
		System.out.println("Name:"+name);
		
	}

	public static void main(String[] args) {
		Acc2 acc2=new Acc2();
		acc2.display();
		
		Acc2 acc3=new Acc2(23456,"badwaik");
		acc3.display();

	}

}
