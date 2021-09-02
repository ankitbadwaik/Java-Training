package CollectionArrayList;
import java.util.*;
public class It {
	String name;
	int rollNo;
	double percentage;
	
	public It(String name,int rollNo,double percentage) {
		this.name=name;
		this.rollNo=rollNo;
		this.percentage=percentage;
	}
	void getStudent() {
		System.out.println("Name :"+name);
		System.out.println("rollno :"+rollNo);
		System.out.println("percent :"+percentage);
	}
	

	public static void main(String[] args) {
		ArrayList <It> list= new ArrayList<It>();
		Scanner sc=new Scanner(System.in);
		String name;
		int rollNo;
		double percentage;
		for(int i=0;i<1;i++) {
			System.out.println("enter the values"+i);
			name=sc.next();
			rollNo=sc.nextInt();
			percentage=sc.nextDouble();
			
			It student=new It(name,rollNo,percentage);
			list.add(student);
			
		}
		
		
		
		Iterator iter = list.iterator();
		 System.out.println("\nthe values after iteration"
                 + " of list are: ");
		 while(iter.hasNext()) {
			 It student2=(It)iter.next();
			 student2.getStudent();
		 }
		
		
	}

}
