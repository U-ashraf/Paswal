package FirstPackage;

public class overloading {

	//overridding happens in between sub class and super class
	//Overloading happens only in same class
	
	//in a class we cant create a multiple methods with same name
	
	public void getData(int x)
	{
		System.out.println("Method1");
	}
	
	public void getData(int x, int y)
	{
		System.out.println("Method2");
	}
	
	public void getData(int x, int y, int z)
	{
		System.out.println("Method3");
	}
	
	public void getData(int x, String y)
	{
		System.out.println("Method4");
	}
	
	public void getData(String X)
	{
		System.out.println("Method5");
	}

	public static void main(String[] args) {
		overloading obj=new overloading();
		obj.getData(10);
		obj.getData(10,20);	
		obj.getData("usman");

		
	}
//when two or more methods have same name and differentiate with number of parameters or different types of parameters
	//is called overloading
}
