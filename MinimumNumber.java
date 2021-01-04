package alphaStar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinimumNumber {
	
	static String pass = "?01?11101?1100?";
	public static void main(String[] args) {
		int[] arr = {01100,
				110,
				11,
				101,
				11001,
				01};
		
		
		
		ArrayList<int[]> poss = new ArrayList<int[]>();
		ArrayList<String> all = new ArrayList<String>();
		
		for(int j = 0;j<poss.size();j++){
			for(int i = 0;i<=pass.length();i++){
				if(i==pass.length()){
					all.add(String.valueOf(poss.get(j)));
					break;
				}
				if(pass.charAt(i)=='?')continue;
			//	else if(pass.charAt(i)-!=poss.get(i)[i]){
				//	break;
				//}
			}
			
			
		}
		
	Collections.max(all);
		

	}
	public static void combinations(int n, int[] arr, List<int[]> list) {
	    // Calculate the number of arrays we should create
	    int numArrays = (int)Math.pow(arr.length, n);
	    // Create each array
	    for(int i = 0; i < numArrays; i++) {
	        list.add(new int[n]);
	    }
	    // Fill up the arrays
	    for(int j = 0; j < n; j++) {
	        // This is the period with which this position changes, i.e.
	        // a period of 5 means the value changes every 5th array
	        int period = (int) Math.pow(arr.length, n - j - 1);
	        for(int i = 0; i < numArrays; i++) {
	            int[] current = list.get(i);
	            // Get the correct item and set it
	            int index = i / period % arr.length;
	            current[j] = arr[index];
	        }
	    }
	}
	}
			

