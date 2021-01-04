package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BovineGenomics {

	public static void main(String[] args) throws IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int[][] spot = new int[n][m];
		int[][] plain = new int[n][m];
		int ret = 0;
		int temp;
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<m;j++){
				temp = Integer.valueOf(st.nextToken());
				 if (temp=='A') spot[i][j] = 0;
			       if (temp=='C') spot[i][j] = 1;
			       if (temp=='G') spot[i][j] = 2;
			       if (temp=='T') spot[i][j] = 3;
			}
		}
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<m;j++){
				temp = Integer.valueOf(st.nextToken());
				 if (temp=='A') plain[i][j] = 0;
			       if (temp=='C') plain[i][j] = 1;
			       if (temp=='G') plain[i][j] = 2;
			       if (temp=='T') plain[i][j] = 3;
			}
		}
		for(int i = 0;i<m;i++){
			for(int j = i+1;j<m;j++){
				for(int k = j+1;k<m;k++){
					for(int l = 0;l<n;l++){
						
					}
				}
			}
		}
		
	}
	

}
