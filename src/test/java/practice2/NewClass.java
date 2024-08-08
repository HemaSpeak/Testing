package practice2;

public class NewClass {
	public static NewClass n1=null;
	public void Hema()
	{
		System.out.println("Hema");
	}
	public void Hema1()
	{
		System.out.println("hema2");
	}
	public void Hema3()
	{
		System.out.println("hema3");
	}
	public static NewClass getInstance() {
		if(n1==null) {
			n1=new NewClass();
		}
		return n1;
	}
	private NewClass() {}
	public static void main(String[] args) {
		NewClass n =new NewClass();
		System.out.println(System.identityHashCode(n));
	}

}
