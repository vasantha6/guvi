
import java.io.*;
import java.lang.*;
 
class GFG 
{
   public static int Nth_of_AP(int a, 
                                int d, 
                                int N)
    { 
        return ( a + (N +2) * d );
    }
  public static void main(String[] args) 
    { 
        
        int a =3; 
        int d =1; 
        int N =1; 
  System.out.print( +Nth_of_AP(a, d, N));
    }
}
