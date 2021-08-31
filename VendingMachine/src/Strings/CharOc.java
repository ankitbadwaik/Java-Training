package Strings;
import java.util.Scanner;
public class CharOc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String str1=sc.next();
		String str=str1.toLowerCase();
		char a=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==a)
				count++;
		}
		
		System.out.println(count);
	}

}
