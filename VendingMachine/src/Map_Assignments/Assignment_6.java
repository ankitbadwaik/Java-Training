package Map_Assignments;
import java.util.*;
public class Assignment_6 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		Set<Integer> key=map.keySet();
		
		System.out.println("--KEYs ARE--");
		for(int i:key)
		{
			System.out.println(i);
		}
		
		
	}

}
