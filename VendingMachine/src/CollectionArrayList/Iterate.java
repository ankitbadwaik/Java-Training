package CollectionArrayList;
import java.util.*;
public class Iterate {

	public static void main(String[] args) {
		 ArrayList<Integer> list
         = new ArrayList<Integer>();

     list.add(10);
     list.add(15);
     list.add(30);
     list.add(20);
     list.add(5);

     System.out.println("The list is: \n"
                        + list);

     Iterator<Integer> iter = list.iterator();

     System.out.println("\nThe iterator values"
                        + " of list are: ");
     while (iter.hasNext()) {
         System.out.print(iter.next() + " ");
     }
	}

}
