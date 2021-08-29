package Oop;

public class Overloading {
	
	public double area(double r) {  //r=radius
		return 3.14*r*r;
	}
	
	public int area(int s) {  //s=side
		return s*s;
	}
	
	public int area(int l, int b) {  //l=length and b=breadth
		return l*b;
	}

	public static void main(String[] args) {
		Overloading o= new Overloading();
		
		System.out.println("Area of circle :" +o.area(5.67));
		System.out.println("Area of square :" +o.area(5));
		System.out.println("Area of rectangle :" +o.area(6,8));
		

	}

}
