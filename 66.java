import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n%1==0)
            { 
              flag = true;
                break;
            }
        }
        if(!flag)
        {
          System.out.println("yes");
         }
        else
            System.out.println("no");
	}
}
