package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigDance {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.valueOf(br.readLine());
	int[] arr = new int[n];
	for(int i = 0;i<n;i++){
		arr[i] = i+1;
	}
	System.out.println(solve(arr,0,arr.length-1));
	}
	public static int solve(int[] arr, int low, int high){
		for(int i = low;i<=high;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
		if(high-low==1){
		
			
			return arr[high]*arr[low];
		}
		if(high-low==0){
			
			return 0;
		}
		else{
			
			return solve(arr, low, ((low+high)/2))+solve(arr,(low+high+2)/2,high);
			
		}
	}

}
