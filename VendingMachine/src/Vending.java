import java.util.Scanner;

public class Vending {

	public static void main(String[] args)
	{
		int amount, originalAmount, quarters, dimes, nickels, pennies;
		
		System.out.println("enter the amount");

		
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextInt();
		
		originalAmount = amount;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
		
		System.out.println(originalAmount + "cents in coins can be given as");
		System.out.println(quarters + "quarters");
		System.out.println(dimes + "dimes");
		System.out.println(nickels + "nickels");
		System.out.println(pennies + "pennies");
		
		
		
		


	}

}
