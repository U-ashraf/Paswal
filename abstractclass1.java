package FirstPackage;

public class abstractclass1 extends abstractclass {

	public static void main(String[] args) {
       abstractclass1 obj= new abstractclass1();
       obj.getdata();
       obj.login();
	}

	@Override
	public void login() {
      System.out.println("hello");		
	}

}
