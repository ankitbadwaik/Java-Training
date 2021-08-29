package ConditionalStatements;
import java.util.Scanner;
public class Alp {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);

	        System.out.println("Enter any Character : ");
	        char ch = scn.next().charAt(0);

	        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

	             System.out.println(ch + " is A ALPHABET.");

	        } else if(ch >= '0' && ch <= '9') {

	             System.out.println(ch + " is A DIGIT.");

	        } else {

	             System.out.println(ch + " is A SPECIAL CHARACTER.");
	        }
	    
	    }
	

	}

