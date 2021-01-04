package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CowHeight {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int cows = Integer.valueOf(br.readLine());
		int[] heights = new int[cows];
		for(int i = 0; i<heights.length;i++){
			heights[i] = Integer.valueOf(br.readLine());
			}
		int count = 0;
		Long sum = 0L;
		
		for(int i = 0;i<heights.length;i++){
			count = 0;
			for(int j = i+1;j<heights.length;j++){
				
				if(heights[i]>heights[j]){
					
					count++;
				}
				else{
					break;
				}
				
			}
			sum+=count;
		}
		System.out.println(sum);
	}

}
