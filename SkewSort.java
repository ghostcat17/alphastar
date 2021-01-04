package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SkewSort {
	private static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		n = (int) (Math.pow(2, n));
		int[] input = new int[n];
		
		for(int i = 0;i<input.length;i++){
			input[i] = Integer.valueOf(br.readLine());
		}
		
		sort(input, 0 ,input.length-1);
		System.out.println(count);
		print(input);
	}	
	

	private static void print(int[] values){
		for(int i=0; i<values.length; i++) System.out.println(values[i] + " ");
		
	}
	
	public static void merge(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	      
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	       
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	      
	       if(L[0]>R[0]){
	    	
	    	   int k = m+1; 
	    	  
	       
	        while (i < n1) 
	        { 
	           
	                arr[k] = L[i]; 
	                i++; 
	                k++;
	                count+=L.length;
	        }
	        k = l;
	        while(j<n2){
	        		
	                arr[k] = R[j]; 
	               
	                j++; 
	                k++;
	                count+=R.length;
	            } 
	           
	        }
	      
	   
	        /* Copy remaining elements of L[] if any */
	    
	    } 
	  
	     // Main function that sorts arr[l..r] using 
	    // merge() 
	    public static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	    } 
}
