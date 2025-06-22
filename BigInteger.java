import java.util.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    BigInteger a = BigInteger.valueOf(1);
		    for(int i=n;i>0;i--)
		    {
		        a = a.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(a.toString());
		}
	}
	
}