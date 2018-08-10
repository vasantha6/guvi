import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int count=1,i=0;
		String s=sc.next();
                      String arr[]=s.split("\t");
    //OOPHelper.println("Number of spaces are: "+arr.length);
    for(i=1;i<s.length()-1;i++)
    {
	     count++;	
    }
    System.out.println(""+count);
	}
}
