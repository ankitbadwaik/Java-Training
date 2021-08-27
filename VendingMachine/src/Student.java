
public class Student {
	public int rollNo;
	protected int addmissionNo;
	private int age;
	int courseId;
	 
	 public int dopublic( int rollNo) {
		 return rollNo;
		 
	 }

	 protected int doprotected() {
		 return addmissionNo;
		 
	 }

	 private int doprivate() {
		 return age;
		 
	 }

	  int dodefault() {
		 return courseId;
		 
	 }
	

	public static void main(String[] args) {
		Student s= new Student();
		
		System.out.println("Rollno "+s.dopublic(2));
		System.out.println("Addmission "+s.doprotected());
		System.out.println("Age "+s.doprivate());
		System.out.println("CourseId "+s.dodefault());
		

	}

}
