package FirstPackage;

public class exception {

	public static void main(String[] args) {
		System.out.println("firstline");
		System.out.println("secondline");
	try {	int x[]=new int[2];
		x[0]=5;
		x[1]=10;
		x[2]=15;
		System.out.println(x[0]);
	}
	catch(ArrayIndexOutOfBoundsException error) {
		System.out.println("arrayoutofbound");
	}
		try {
			 int a=30;
             int b=0;
             int c=a/b;
             System.out.println(c);
			
		}
		catch(ArithmeticException error){
			System.out.println("can't divide by zero" );
		}
		finally {
			System.out.println("clearbrowserhistory");
			System.out.println("closebrowser");
		}
             
              System.out.println("thirdline");
              System.out.println("fourthline");
	}

}
