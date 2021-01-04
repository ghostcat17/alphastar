package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rope {
	static int[] knotValues;
	public static void main(String[] args) throws IOException{
		int x, y;
		BufferedReader br;
		String line;
		br = new BufferedReader(new InputStreamReader(System.in));
	
		line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		x = Integer.valueOf(st.nextToken());
		y = Integer.valueOf(st.nextToken());
		
		knotValues = new int[x];
		
		for(int i = 0;i<knotValues.length;i++){
			knotValues[i] = Integer.valueOf(br.readLine());
			
			
		}
		
		
		boolean[] arr = new boolean[y+1];
		quickSort(0,x-1);
		int i,N = knotValues.length,sum = 0;
		boolean a = true;
	
		 /* Convert knots array into successive differences */
		  for (i=0; i<N-1; i++)
		    knotValues[i] = knotValues[i+1] - knotValues[i];

		  /* Check left palindromes */
		  
		  for (i=0; i<N-1; i++){
			  if (check_palindrome(0,i)==1) sum++;
		  }
		  
		    

		  /* Check right palindromes */
		 
		  for (i=1; i<N-1; i++){
			  if (check_palindrome(i,N-2)==1) sum++;
		  }
		
		System.out.println(sum);
	}
	
	private static int check_palindrome(int start, int end)
	{
	  int i;
	  for (i=0; start+i<=end-i; i++)
	    if (knotValues[start+i] != knotValues[end-i]) return 0;
	  return 1;
	}

	private static void quickSort( int low, int high){
		if(low>=high)return;
		
		int pivot = knotValues[(low+high)/2];//This looks good. But, that's all
		
		
		
		int i = low,j=high,temp;
		while(i<=j){
			while(knotValues[i]<pivot)i++;
			while(knotValues[j]>pivot)j--;
			if(i<=j){
				temp = knotValues[i];
				knotValues[i] = knotValues[j];
				knotValues[j] = temp;
				i++;
				j--;

			}
		}
		quickSort( low, j);
		quickSort(i, high);
		
	}
	public static int lower(int a, int b){
		if(a>b)return b;
		return a;
		
	}
}
