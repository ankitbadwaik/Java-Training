import java.util.*;

public class Digit {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=scan.nextInt();
		if(num>99 && num<1000)
		{
			System.out.println("It is a Three Digit Number.");
		}
		else
		{
			System.out.println("It is Not a Three Digit Number.");
		}

	   }
	}

			
