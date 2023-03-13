package FirstPackage;

public class constructor {
	public constructor(int x)
	{
		System.out.println("this is a consructor");
	}
	public void method(String x)
	{
		System.out.println(x);
	}
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
     constructor obj=new constructor(5);
     obj.method("usman");
     obj.add(10, 20);
	}

}
