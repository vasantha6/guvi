/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
     
   
    static float sumOfAP(float a, float d, 
                                  int n)
    {
        float sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
     
    
    public static void main(String args[])
    {
        int n = 3;
        float a = 1, d = 1;
        System.out.println(sumOfAP(a, d, n));
    }
}
 
