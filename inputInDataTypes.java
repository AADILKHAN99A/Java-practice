import java.lang.*;
import java.util.*;

class inputInDataTypes
{
	public static void main(String arg[])
	{
		// long ln= 9999999999999999;
         long ln= 9_999_999_999_999_999l;    // _ allowed but not , for improve readability 

        // float f= 12.5666;
        float f= 126_354.5666f;

        System.out.println(ln);
        System.out.println(f);
        
        
        
        int i = -5;
        System.out.println("No 5 is stored in the form of : "+Integer.toBinaryString(i));



	}
}	
