
public class Prog_7 
{
	public static void main(String[] args) 
	{
		//Write a Java Program to exchange the values of two variables of integer type X and Y using third 
		//temporary variable Z.
		//Omm Devgoswami (2241004223)
		
		int X=8;
		int Y=9;
		System.out.println("Before Swap");
		System.out.println("The value of X is "+X+" and the value of Y is "+Y);
		int Z=0;
		Z=X;
		X=Y;
		Y=Z;
		System.out.println("After Swap");
		System.out.println("The value of X is "+X+" and the value of Y is "+Y);
	}


}
