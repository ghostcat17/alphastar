package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.SortingFocusTraversalPolicy;

public class QuickSort {
	private static int[] input;
	  public static void main(String[] args) throws NumberFormatException, IOException{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = new int[Integer.valueOf(br.readLine())];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0;i<input.length;i++){
				input[i] = Integer.valueOf(st.nextToken());
			}
			//partition(0,input.length-1,input.length-2);
	        quickSort(0, input.length-1);
	    }
	  
	    public static int partition(int left, int right, int pivot) {
	    	
	    	 int low = left-1;
	    	 int high = right;
	    	
	         while(true){
	             while(input[++low] < pivot){
	            	 
	             }
	             while(high>0&&input[--high] > pivot){
	                 
	             }
	            if(low>=high){
	            	break;
	            }
	            	else{
	            		swap(low, high);
	            	}
	            
	         }
	         swap(low, right);
	       
	         for(int k = 0;k<input.length;k++){
		       	System.out.print(input[k]+" ");
		        }
	         System.out.println();
	         return low;
	      
	       
	    }

	    public static void swap(int left, int right){
	    	int temp = input[left];
	    	input[left] = input[right];
	    	input[right] = temp;
	    }
	    

	    public static void quickSort(int start, int end) {
	    	  if (end-start<=0) return;
	    	  else{
	    		  int pivot = input[end];
	    		  int index = partition(start, end,pivot);
		    	    quickSort( start, index - 1);
		    	    quickSort( index + 1, end);
	    	  }
	    	   
	      }
	
}
