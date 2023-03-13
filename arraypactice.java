package FirstPackage;

public class arraypactice {

	public static void main(String[] args) {
		//int x[]= {10,20,30,40,50};
		int x[]=new int[5];

		x[0]=50;
		x[1]=60;
		x[2]=70;
		x[3]=80;
		x[4]=90;
		
		/*System.out.println(x[4]);
		System.out.println(x.length);
      for(int i=0;i<x.length;i++ )
      {
    	  System.out.println(x[i]);
      }
      */
		for(int i=x.length-1;i>=0;i--)
		{
		System.out.println(x[i]);	
		}
	}

}

