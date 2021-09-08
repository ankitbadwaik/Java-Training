package Map_Assignments;
import java.util.*;
public class Assignment_1 {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		map.put(1, "Hi");
		map.put(2, "hello");
		map.put("bye", 3);
		map.put("take care", 4);
		
		Set key=map.keySet();
		
		for(Object i:key)
		{
			System.out.println(i+" -> "+map.get(i));
		}
	}

}
