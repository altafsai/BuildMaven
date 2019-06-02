package daynine;

public class Childmethod extends Parentmethods{
	
	public void divide()
	{
		System.out.println("This is a divide method");
	}
	
	public void multiply()
	{
		System.out.println("This is a multiply method");
	}
	
	public static void main(String[] args) 
	{
		Parentmethods pm= new Parentmethods();
		pm.add();
		pm.subtract();
		
		Parentmethods pms= new Childmethod();
		pm.add();
		pm.subtract();
		
		Childmethod cms= new Childmethod();
		cms.add();
		cms.subtract();
		cms.divide();
		cms.multiply();
		
	}
	
	

}
