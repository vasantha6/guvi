import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  String s1,s2;	
      Scanner sc=new Scanner(System.in);
      s1=sc.next();
      s2=sc.next();
      if(s1.length()>s2.length())
      {
       System.out.println(s1);
      }
      else if(s1.length()==s2.length())
      {
        System.out.println(s2);
       }
     else
       System.out.println("invalid");
	}
}
