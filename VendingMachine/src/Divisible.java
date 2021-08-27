import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		int number;
		Scanner div = new Scanner(System.in);
		
		System.out.print(" Enter any Number ");
		number = div.nextInt();	
		
		if((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println("\n Given number " + number + " is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println("\n Given number " + number + " is Not Divisible by 5 and 11"); 
		}	
	}
}
	
		
		




