package CollectionArrayList;
import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		 List<Integer> al = new ArrayList<Integer>();
	        al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(40);
	  
	        Object[] objects = al.toArray();
	  
	        for (Object obj : objects)
	            System.out.print(obj + " ");
	}

}
