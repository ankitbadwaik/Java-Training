package Exceptions;

public class DivideByZeroException extends Exception {


		public DivideByZeroException()
		{
			super("Divide by zero do not enter zero values ");
		}
		
		
		public DivideByZeroException(String msg)
		{
			super("Divide by zero error");
		}
	

}
