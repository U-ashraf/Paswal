package FirstPackage;

public class Accessmodifier {
	public void getdata()
	{
		System.out.println("hi");
	}
	void login()
	{
		System.out.println("usman");
	}
	protected void sale()
	{
		System.out.println("excellent");
	}
	private void gsm()
	{
		System.out.println("my gsm");
	}

	public static void main(String[] args) {
      Accessmodifier obj=new Accessmodifier();
      obj.getdata();
      obj.login();
      obj.sale();
      obj.gsm();
	}

}
