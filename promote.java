package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class promote {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("promote.in")));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("promote.out")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[4][2];
		for(int i =0;i<arr.length;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j =0;j<arr[i].length;j++){
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		int[] nums = new int[3];
		for(int i = arr.length-1;i>=0;i--){
			int difference = arr[i][1]-arr[i][0];
			if(difference>0){
				int j = i-1;
				while(j>=0&&difference>0){
					
					nums[j]+=difference;
					if(arr[j][1]<arr[j][0]){
						difference+=arr[j][1]-arr[j][0];
						if(difference<0)break;
						
					}
					
					
					
					j--;
				}
			}
		}
		for(int i = 0;i<nums.length;i++){
			pw.println(nums[i]);
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
