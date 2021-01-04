package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TheCowSignal {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		Character[][] arr = new Character[m][n];
		Character[][] dup = new Character[m*k][n*k];
		for(int i = 0;i<m;i++){
			String s = br.readLine();
			for(int j = 0;j<n;j++){
				arr[i][j] = s.charAt(j);
				
			}
		}
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				for(int l = 0;l<k;l++){
					dup[i*k][(j*k)+l] = arr[i][j];
				}
				for(int l = 1;l<k;l++){
					copy(dup[i],dup[(i*k)+l]);
				}
				
			}
		}
		for (Character[] row : dup)
		{
		    
		    for(Character cha: row){
		    	System.out.print(cha);
		    }
		    System.out.println();
		}
		
	}
	public static void copy(Character[] arr, Character[] next){
		for(int i = 0;i<arr.length;i++){
			next[i] = arr[i];
		}
	}

}
