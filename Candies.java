import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n = 2 * sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    boolean flag = true;
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    
		    for(int i=0; i<n-2; i++)
		    {
		        if((arr[i] == arr[i+1]) && (arr[i+1] == arr[i+2]))
		        {
		            flag = false;
		            break;
		        }
		    }
		    System.out.println((flag)?"YES":"NO");
		}
	}
}
