package ConditionalStatements;

public class Max {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=5;
		
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		if(b>a && b>c) {
			System.out.println("b is greater");
			
		}
		else {
			System.out.println("c is greater");
		}

	}

}
