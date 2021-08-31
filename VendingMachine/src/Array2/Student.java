package Array2;

public class Student {
	int id;
	String name;
	String[] hobbies;
	int i;
	
	public Student(int id, String name, String[] hobbies) {
		
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}

	public void getStudent()
	{
		
		
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Hobbies : ");
		for(i=0;i<hobbies.length;i++)
		{
			System.out.print(hobbies[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		Student[] students=new Student[2];
		
		String[] hobby= {"Reading","Playing","Dancing"};
	
		
		students[0]=new Student(21,"ankit",hobby);
		
		
		
		students[0].getStudent();
		System.out.println(" ");
		
		

	}

}
