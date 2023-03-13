package FirstPackage;

public class child extends parentclass {
	public void freetime()
	{
		System.out.println("child has free time");
		super.freetime();
	}
	public void nomoney()
	{
		System.out.println("child has no money");
	}

	public static void main(String[] args) {
		child obj=new child();
		obj.nomoney();
		obj.money();
		obj.flat();
		obj.freetime();

	}

}
//whenever sub class and super class have same property then sub class property override
//the superclass property is called overriding
//with super keyword child can use the property of parent within method
//overriding happens in sub class and super class 
//overloading happens in same class