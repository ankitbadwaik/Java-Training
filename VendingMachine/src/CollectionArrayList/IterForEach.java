package CollectionArrayList;
import java.util.*;
public class IterForEach {

	public static void main(String[] args) {
		 List<Integer> l=new LinkedList<Integer>();
		 
	        l.add(7);
	        l.add(3);
	        l.add(4);
	 
	        List<Integer> s=new LinkedList<Integer>();
	        s.add(2);
	        s.add(9);
	        s.add(5);
	        s.add(6);
	 
	        for (int a:l)
	        {
	            for (int b:s)
	            {
	                if (a<b)
	                    System.out.print(" "+a);
	            }
	        }
	}

}
