import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
	    		for( int j=i;j<n;j++)
    			{
    				if(a[i]>a[j])
    				{
    					temp=a[j];
    					a[j]=a[i];
    					a[i]=temp;	
    				}
    			}
		}
		if(n%2==0)
		{
			   System.out.println((a[n/2]+a[(n-1)/2])/2.0);
		}
		else
		System.out.println(a[n/2]);
		}
	}
