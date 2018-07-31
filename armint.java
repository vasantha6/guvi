import java.util.*;
import java.lang.*;
import java.io.*;


class Interval
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int low = 153, high = 371;

        for(int number = low + 1; number < high; ++number)
        {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

           
            while (originalNumber != 0) 
            {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            while (originalNumber != 0)
            {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
    }
}
	
