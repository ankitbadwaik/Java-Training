import java.util.Scanner; 

public class Calculator {
 public static void main(String[] args) {
  Scanner cal = new Scanner(System.in);
  
  System.out.println("Enter num 1 and num 2 to calc");
  
  int a= cal.nextInt();
  int b=cal.nextInt();
  System.out.println("Enter sum=0/sub=1/mul=2/div=3/rem=4 operation to do");
  int c = 0;
  int  ope= cal.nextInt();
  if(ope==0) c=a+b;
  
  else if(ope==1) c=a-b;
  
  else if(ope==2) c=a*b;
  
  else if(ope==3) c=a/b;
  
  else if(ope==4) c=a%b;
  
  else System.out.println("invalid symbol so incorrect output");
  
  System.out.println("The " +ope +" of " +a +" " +b +" is " +c);  
 }
}