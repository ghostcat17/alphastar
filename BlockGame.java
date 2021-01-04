package alphaStar;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockGame {
	static ArrayList<String[]> arr = new ArrayList<String[]>();
	public static void main(String[] args) {
			String array[] = {"1", "2", "3", "4", "5","6"}; 
	        int r = 3; 
	        int n = array.length; 
	        String data[]=new String[r]; 
	        
	        // Print all combination using temprary array 'data[]' 
	        combinationUtil(array, data, 0, n-1, 0, r); 
	        
	        for(String[] a: arr){
	        	System.out.println(Arrays.toString(a));
	        }
	}
	public static void combinationUtil(String array[], String data[], int start, 
			int end, int index, int r) 
	{ 
		// Current combination is ready to be printed, print it 
		if (index == r) 
		{ 
			//has to be cloned because they all point to the same ref that is changed later
			//clone creates a new copy
			arr.add(data.clone());
			return;
		} 

		// replace index with all possible elements. The condition 
		// "end-i+1 >= r-index" makes sure that including one element 
		// at index will make a combination with remaining elements 
		// at remaining positions 
		for (int i=start; i<=end && end-i+1 >= r-index; i++) 
		{ 
			data[index] = array[i]; 
			combinationUtil(array, data, i+1, end, index+1, r); 
		} 
	} 
}
