import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
	    int n,sum;
        Scanner a=new Scanner(System.in);
	    System.out.println("Enter a number ");
                   n=a.nextInt();
	    for(sum=1 ;n!=0 ;n/=10)
	    {
		sum=sum * n%10;
	    }
	    System.out.println("products of digits of a number is "+sum); 
	}

}
