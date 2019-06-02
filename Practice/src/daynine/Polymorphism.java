package daynine;

public class Polymorphism {
	
	public static void add()
	{
		System.out.println("This is a add method");
	}
	
	public static void add(int a, int b)
	{
		System.out.println("This is a add method");
	}
	
	public static void add(int a, int b, int c)
	{
		System.out.println("This is a add method");
	}
	
	public static void add(String abc, int b, int c)
	{
		System.out.println("This is a add method");
	}
	
	public static void add(int b, int c, String abc)
	{
		System.out.println("This is a add method");
	}
	
	public static void main(String[] args) {
		
		Polymorphism.add();
		Polymorphism.add(1, 2);
		
	}
	
	
	
	
	

}
