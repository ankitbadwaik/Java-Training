package Exceptions;
import java.util.*;

class Parent{    
	  void msg() {  
	    System.out.println("parent method");  
	  }    
	}    

public class ExceptionMethodOveridding extends Parent {
	 void msg()throws ArithmeticException {    
		    System.out.println("child method");    
		  }    
	

	public static void main(String[] args) {
		 Parent p = new ExceptionMethodOveridding();    
		   p.msg();    
	}

}
