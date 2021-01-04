package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort {
	
	  public static void main(String[] args) throws NumberFormatException, IOException{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] input = new int[Integer.valueOf(br.readLine())];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0;i<input.length;i++){
				input[i] = Integer.valueOf(st.nextToken());
			}
			mergeSort(input);
			
	  }
	  public static void mergeSort(int[] values){
			int[] temp = new int[values.length];
			mergeSort(values, 0, values.length-1, temp);
		}
		
		
		private static void mergeSort(int[] values, int low, int high, int[] temp){
			
			if(low>=high) return;
			int mid = (low+high)/2;
			
			mergeSort(values, low, mid, temp);
			mergeSort(values, mid+1, high, temp);
			
	for(int i=low; i<=high; i++) temp[i] = values[i];
			
			int i=low, j=mid+1, k=low;
			while(i<=mid && j<=high){
				if(temp[i]<=temp[j]) values[k++] = temp[i++];
				else  values[k++] = temp[j++];
			}
			
			while(i<=mid) values[k++] = temp[i++];
			 print(values);

		}
		
		

		private static void print(int[] values){
			for(int i=0; i<values.length; i++) System.out.print(values[i] + " ");
			System.out.println();
		}
		

}
