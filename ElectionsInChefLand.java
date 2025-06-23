import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(sc.readLine());
		
		while(t-- > 0)
		{
		    String[] str = sc.readLine().split(" ");
		    int a = Integer.parseInt(str[0]);
		    int b = Integer.parseInt(str[1]);
		    int c = Integer.parseInt(str[2]);
		    
		    pw.println((a>50)?"A":((b>50)?"B":((c>50)?"C":"NOTA")));
		    
		    pw.flush();
		}
	}
}
