package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CowJog {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[n];
		int count = 0;
		for(int i = 0;i<n;i++){
			arr[i] = getSpeed(br.readLine());
			
		}
		int min = 1000000000;
		
		for(int i = n-1;i>=0;i--){
			
			if(min>=arr[i]){
				
				count++;
				min = arr[i];
			}
			
				arr[i] = min;
			
			
		}
		
		System.out.println(count);
	}
	public static int getSpeed(String line){
		StringTokenizer st = new StringTokenizer(line, " ");
		st.nextToken();
		return Integer.valueOf(st.nextToken());
	}

}
