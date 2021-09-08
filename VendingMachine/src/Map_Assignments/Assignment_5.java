package Map_Assignments;
import java.util.*;
public class Assignment_5 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Hi");
		map.put(2, "Hello");
		map.put(3, "GoodBye");
		
		Set<Integer> key=map.keySet();
		
		for(int i:key)
		{
			System.out.println(i+" : "+map.get(i));
		}
	}

}
