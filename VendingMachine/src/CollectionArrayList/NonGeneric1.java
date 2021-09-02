package CollectionArrayList;
import java.util.*;
public class NonGeneric1 {

	public static void main(String[] args) {
		ArrayList my_list = new ArrayList();
	      my_list.add(1);
	      my_list.add(2);
	      my_list.add("Nate");
	      my_list.add("Bill");
	      int s1 = (int)my_list.get(0);
	      int s2 = (int)my_list.get(1);
	      String s3 = (String)my_list.get(2);
	      String s4 = (String)my_list.get(3);
	      System.out.println(s1);
	      System.out.println(s2);
	      System.out.println(s3);
	      System.out.println(s4);
	}

}
