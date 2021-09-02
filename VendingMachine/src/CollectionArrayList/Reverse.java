package CollectionArrayList;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("yash");
		list.add("pranay");
		list.add("prince");
		System.out.println("the list is :\n"+list);
		 
		Collections.reverse(list);
		System.out.println("the after reverse :\n"+list);
        ListIterator<String> itr = list.listIterator();
 
        while (itr.hasPrevious()) {
        	System.out.println(itr.previous());
            }
	}

}
