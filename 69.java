/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		int n=n1-n2;
		if(n%2==0)
		{
			System.out.println("even");
		
		}
		else
		{
			System.out.println("odd");
		}
	}
}
