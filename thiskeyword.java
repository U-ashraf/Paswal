package FirstPackage;

public class thiskeyword {
	int x=10;// instance or global variable
	public void login()
	{
		int x=20;
		System.out.println(this.x);
	}
	

	public static void main(String[] args) {
		thiskeyword obj=new thiskeyword();
		obj.login();

	}

}
//whenever global and local variable have same name with THIS keyword we can use global variable