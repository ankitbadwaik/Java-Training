package Map_Assignments;
import java.util.*;

public class Assignment_8 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Student> map=new HashMap<Integer, Student>();
		map.put(1, new Student("Ankit", 21));
		map.put(2, new Student("Yash", 27));
		
		System.out.println(map);
	}

}
