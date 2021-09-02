package CollectionArrayList;
import java.util.*;
public class Swaping {

	public static void main(String[] args) {
		ArrayList<Integer> ArrList = new ArrayList<Integer>();
		 
        ArrList.add(15);
        ArrList.add(71);
        ArrList.add(5);
        ArrList.add(23);
        ArrList.add(46);
 
        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrList);
 
        // Swapping the elements at 1 and 2 indices
        Collections.swap(ArrList, 1, 2);
 
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrList);
	}

}
