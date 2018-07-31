/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int N,A,D,sum=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		A=sc.nextInt();
		D=sc.nextInt();
		for(int i=1;i<=N;i++);
		{
			sum=sum+A;
			A=A+D;
		}
			System.out.print(sum);

	}
}
