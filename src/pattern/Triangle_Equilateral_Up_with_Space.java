package pattern;

public class Triangle_Equilateral_Up_with_Space {

	public static void main(String[] args) 
	//    *
	//   * *
	//  * * *
	// * * * *
	
	
	{
		int star=1;
		int space=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();
		}

	}

}
