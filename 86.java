

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner s=new Scanner(System.in);
	String n=s.nextLine();
	int len=n.length();
	char ch[]=n.toCharArray();
	int x=0;
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{ 
				x=1;
			}
		}
	}
		if(x==1)
		{
				System.out.println("No");
		}else
		{
				System.out.println("Yes");
		}
	}
}

