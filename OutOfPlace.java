package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OutOfPlace {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[n]; 
		int index = 0;
		
		for(int i = 0;i<arr.length;i++){
			arr[i] = Integer.valueOf(br.readLine());
			if(i>1){
				if(arr[i]<arr[i-1]){
					index = i;
				}
			}
			
		}
		int[] sorted = arr.clone();
		Arrays.sort(sorted);

		
	}

}
