
public class HW_Prog_5
{

	public static void main(String[] args) 
	{

		System.out.println("Swapping Values using extra Variables :");
		int W=8;
		int G=9;
		int K=6;
		int A=1;
		System.out.println("Before Swap");
		System.out.println("The value of W is "+W+",The value of G is "+G+",The value of K is "+K+" and the value of A is "+A);
		int B=0;
		B=W;
		W=G;
		G=K;
		K=A;
		A=B;
		System.out.println("After Swap");
		System.out.println("The value of W is "+W+",The value of G is "+G+",The value of K is "+K+" and the value of A is "+A);
		System.out.println();
		System.out.println("Swapping Values without using extra Variables :");
		W=8;
		G=9;
		K=6;
		A=1;
		W=W*G*K*A;
		A=W/(G*K*A);
		K=W/(G*K*A);
		G=W/(G*K*A);
		W=W/(G*K*A);
		System.out.println("After Swap");
		System.out.println("The value of W is "+W+",The value of G is "+G+",The value of K is "+K+" and the value of A is "+A);

	}

}
