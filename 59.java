import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner sc=new Scanner(System.in);

        int count = 0; 
        int n=sc.nextInt();

        while(n != 0)
        {
            n/= 10;
            ++count;
        }

        System.out.println(count);
    }
}
