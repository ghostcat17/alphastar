package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TamingTheHerd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[n];
		int min = 1, max = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> counter = new ArrayList<Integer>();
		counter.add(0);
		for(int i = 0;i<n;i++){
			arr[i] = Integer.valueOf(st.nextToken());
			if(arr[i]>-1)counter.add(i);
			
		}
		for(int i = counter.size()-1;i>0;i--){
			int count = 0;
			
			
			for(int j = counter.get(i)-1;j>counter.get(i-1);j--){
				
				count++;
				if(arr[counter.get(i)]-count>0){
					
					continue;
				}
				else if(arr[counter.get(i)]-count==0){
					
					min++;
					max++;
				}
				else if(arr[counter.get(i)]-count<0){
					
					max++;
				}
			}
		}
		System.out.print(min);
		System.out.print(" "+ max);
		
		
		
	}
	
}
