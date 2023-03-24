import java.lang.*;
import java.util.*;

class radix
{
	public static void main(String arg[])
	{
		Scanner s= new Scanner(System.in);
		s.useRadix(8);
		int a = s.nextInt();
		System.out.println(a);
	}
}