package FirstPackage;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// 1 2 3   //row=0
		// 4 5 6
		// 7 8 9
		// 10 11 12
		// 13 14 15
        /*  int x [][]=new int [5][3];
          x[0][0]=1;
          x[0][1]=2;
          x[0][2]=3;
          System.out.println(x[0][2]);
          */
		int x[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(x[i][j]);
			}
			System.out.println("\t");

		}
	}

}
//whenever print rows and columns first for loop for rows and inner loop is for columns