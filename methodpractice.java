package FirstPackage;

public class methodpractice {

	public static void main(String[] args) {
		methodpractice obj=new methodpractice();
		obj.login("Usman", "test123");
	

	}
	public void login(String username ,String password)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println("click login");
	}
	

}
