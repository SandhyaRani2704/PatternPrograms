package pattern;

public class Diamond_Pattern {

	public static void main(String[] args) 
	{
		 //   *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        
        // row=9, col=5, star=1, space=4
        int star=1;
        int space=4;
        
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print("* ");
            }
            if(i<5)
            {
                star++;
                space--;
            }
            else
            {
                star--;
                space++;
            }
            System.out.println();
        }

	}

}
