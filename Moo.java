package alphaStar;

import java.io.*;

public class Moo {
	private static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.valueOf(br.readLine());
		
	
		System.out.println(solve(n,0));
	}
	public static int len(int k){
		if(k==-1)return 0;
		else{
			int temp = len(k-1);
			return temp+ k+3+ temp;
		}
	}
	public static char solve(int n, int k)
	{
	  if (n > len(k)) return solve(n,k+1);
	  if (n <= len(k-1)) return solve(n,k-1);
	  n = n - len(k-1); 
	  if (n <= k+3) 
		  
	    return (n==1) ? 'm' : 'o';
	  n = n - (k+3);
	  return solve(n,k-1); 
	}
}
