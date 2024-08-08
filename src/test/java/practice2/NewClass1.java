package practice2;

public class NewClass1 {

	public static void main(String[] args) {
		NewClass n= NewClass.getInstance();
		System.out.println(System.identityHashCode(n));

	}

}
