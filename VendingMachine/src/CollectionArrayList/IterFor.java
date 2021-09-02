package CollectionArrayList;
import java.util.*;
public class IterFor {

	public static void main(String[] args) {
		 List<String> crunchifyList = new ArrayList<String>();
		 
	        crunchifyList.add("Facebook");
	        crunchifyList.add("Paypal");
	        crunchifyList.add("Google");
	        crunchifyList.add("Yahoo");
	 
	        List<String> crunchifyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");
	 
	        System.out.println("the various companies are :");
	        for (int i = 0; i < crunchifyList.size(); i++) {
	            System.out.println(crunchifyList.get(i));
	        }
	 
	}

}
