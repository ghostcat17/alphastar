package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DNASequencing2 {
	public static Set<String> set = new HashSet<String>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		String[] arr = new String[n];
		for(int i = 0;i<n;i++){
			arr[i] = br.readLine();
		}
		int length = 1000;
		String a;
		List<List<String>> permute = permute(arr);
		for(List<String> perm:permute)
		{
			
			a = "";
			for(String s:perm){
				
			
				
				a = merge(a, s);
				
				
			}
			
			if(a.length()<length){
				
				length = a.length();
			}
		}
		if(length==1000)System.out.println(arr[0].length());
		else{
			System.out.println(length);	
		}
		
	}
	public static List<List<String>> permute(String[] arr) {
		List<List<String>> list = new ArrayList<>();
		permuteHelper(list, new ArrayList<>(), arr);
		return list;
	}
 
	private static void permuteHelper(List<List<String>> list, List<String> resultList, String[] arr){
 
		// Base case
		if(resultList.size() == arr.length){
			list.add(new ArrayList<>(resultList));
		} 
		else{
			for(int i = 0; i < arr.length; i++){ 
 
				if(resultList.contains(arr[i])) 
				{
					// If element already exists in the list then skip
					continue; 
				}
				// Choose element
				resultList.add(arr[i]);
				// Explore
				permuteHelper(list, resultList, arr);
				// Unchoose element
				resultList.remove(resultList.size() - 1);
			}
		}
	} 
 

	public static String merge(String s1, String s2){
		

		// from the longest overlap to the shortest possible.
		for (int len = 0; len < s1.length(); len++) {
			if(s2.startsWith(s1.substring(len))){
				
				return s1.substring(0, len)+s2;
			}
		}
		
		return s1+s2;

	}
}
