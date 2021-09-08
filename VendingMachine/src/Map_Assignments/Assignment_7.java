package Map_Assignments;
import java.util.*;
public class Assignment_7 {

	public static void main(String[] args) {
HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		
		Collection str=map.values();
		
		System.out.println("--VALUES ARE--");
		System.out.println(str);
	}

}
