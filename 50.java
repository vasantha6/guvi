import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class poww
{
     public static void main(String aa[])
     {
     int a,b,f=0;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     while(a!=1)
     {
         if(a%2!=0)
         {
             f=1;
         }
         a=a/2;
        }
     if(f==1){
         System.out.println("no");
     }
 else{
         System.out.println("yes");
 }
    }
}
