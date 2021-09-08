package Debug;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Debugging.....");
		Counter counter = new Counter();
		counter.count();
		System.out.println("We have counted " + counter.getResult());
	}
}


