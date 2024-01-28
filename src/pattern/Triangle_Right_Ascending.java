package pattern;

public class Triangle_Right_Ascending {

	public static void main(String[] args) 
	{
		//       *
		//      **
		//     ***
		//    ****
		//   *****
		
		//row=5 coloumn=5 1st row star=1 1st row space=4
		
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();
		}
		}
				

	}

