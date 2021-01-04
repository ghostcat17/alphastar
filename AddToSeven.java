package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AddToSeven {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int nums = Integer.valueOf(line);
		int[] ret = new int[nums];
		ret[0] = Integer.valueOf(br.readLine());
		for(int i = 1;i<nums;i++){
			ret[i] = (Integer.valueOf(br.readLine())+ret[i-1])%7;
			
		}
		
		System.out.println(maxSpan(ret)-1);
		
		
	}
	
	public static int maxSpan(int[] nums) {
		
		    int highestSpan = 0;
		    for (int i = 0; i < nums.length; i++) {
		        for (int j = nums.length-1; j >= i+highestSpan ; j--){
		            if (nums[i] == nums[j]){
		                highestSpan = Math.max(j - i + 1, highestSpan);
		            }
		        }
		    }
		    return highestSpan;
		}
}
