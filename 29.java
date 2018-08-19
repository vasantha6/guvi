/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int m1=m%60;
        int m2=m1/60;
        System.out.println(m2+" "+m1);
	}
}
