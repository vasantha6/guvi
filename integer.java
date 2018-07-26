/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println("enter three integers");
		if ( x > y && x > z )
         System.out.println("First number is largest.");
      else if ( y > x && y > z )
         System.out.println("Second number is largest.");
      else if ( z > x && z > y )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
	}
}
