package alphaStar;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TheBovineShuffle {
	static ArrayList<int[]> arr = new ArrayList<int[]>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("shuffle.out")));
		int n = Integer.valueOf(br.readLine());
		int[] org = new int[n];
		int[] swaps = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0;i<n;i++){
			swaps[i] = Integer.valueOf(st.nextToken());
			
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<n;i++){
			org[i] = Integer.valueOf(st.nextToken());
		}
	
		printAllRecursive(n, org);
		
	
		for(int i = 0;i<arr.size();i++){
			System.out.println(Arrays.toString(arr.get(i)));
			System.out.println(Arrays.toString(swap(arr.get(i),swaps)));
			System.out.println();
			if(swap(arr.get(i),swaps).equals(org)){
				
				System.out.println(arr.get(i));
			}
				
		}	
		
	}
	

	public static void printAllRecursive(int n, int[] elements ) {
		
		if(n == 1) {
			
			arr.add(elements);
			
		} else {
			for(int i = 0; i < n-1; i++) {
				printAllRecursive(n - 1, elements);
				if(n % 2 == 0) {
					change(elements, i, n-1);
				} else {
					change(elements, 0, n-1);
				}
			}
			printAllRecursive(n - 1, elements);
		}
		
	}

	public static int[] swap(int[] arr, int[] swaps){
		int[] a = arr.clone();
		for(int i = 0;i<3;i++){
			for(int j = 0;j<arr.length;j++){
				for(int l = 0;l<swaps.length;l++){
					change(a, j, swaps[l]-1);
				}
			}
		}
		return a;
	}
	public static void change(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
