import java.util.*;
import java.lang.*;
import java.io.*;
class Fib
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		int a, b, d, n;
		a = b = 1;
		for (n = 1; n <= ch; n++)
			{
			    System.out.print(a+" ");
			    d =a+b;
			    a =b;
			    b =d;
			}
	}
}
