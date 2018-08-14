import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0,average=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum= sum+a[i];
        }
       average = sum / n;
        System.out.println(average);
}
}
