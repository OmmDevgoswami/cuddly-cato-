
public class Prog_8 
{

	public static void main(String[] args) 
	{
		//Write a Java Program to exchange the values of two variables of integer type X and Y without using 
				//third temporary variable.
				//Omm Devgoswami (2241004223)
				
				int X=8;
				int Y=9;
				System.out.println("Before Swap");
				System.out.println("The value of X is "+X+" and the value of Y is "+Y);
				X=Y+X;
				Y=X-Y;
				X=X-Y;
				System.out.println("After Swap");
				System.out.println("The value of X is "+X+" and the value of Y is "+Y);
				System.out.println();
				System.out.println("Multiplication-Division Try");
				X=Y*X;
				Y=X/Y;
				X=X/Y;
				System.out.println("After Swap 2");
				System.out.println("The value of X is "+X+" and the value of Y is "+Y);

	}

}
