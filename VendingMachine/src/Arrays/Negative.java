package Arrays;
import java.util.Scanner;
public class Negative {

	public static void main(String[] args) {
		int Size, i;
		int negativeCount = 0;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		
		

		for(i = 0; i < Size; i++)
		{
			if(a[i] <= 0)
			{
				negativeCount++;
			}
			
		}		
		System.out.println("\n Total Number of Negative Numbers in this Array = " + negativeCount);
	}
	

	}

