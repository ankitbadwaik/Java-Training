package Map_Assignments;
import java.util.*;
public class Assignment_4 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 123);
		map.put(2, 234);
		map.put(3, 345);
		map.put(4, 456);
		map.put(5, 567);
		
		Set<Integer> countSetr=map.keySet();
		
		int count=countSetr.size();
		System.out.println(count);
	}

}
