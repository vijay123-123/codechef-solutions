import java.util.*;
import java.lang.*;
import java.io.*;

class AdjacentSumParity
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int sum = 0;
		    while(n-- > 0)
		    {
		        sum += sc.nextInt();
		    }
		    System.out.println((sum%2==0)?"YES":"NO");
		}
	}
}
