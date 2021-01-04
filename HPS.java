package alphaStar;

import java.io.*;
public class HPS{
public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.valueOf(br.readLine());
	    int[] moves = new int[n];
	  
	    for(int i = 0;i<n;i++){
	    	String line = br.readLine();
	    	if(line.equals("H")) moves[i] = 1;
	    	if(line.equals("P")) moves[i] = 2;
	   
	    
	    }
	  
	   
	
		int[][] matches = new int[3][moves.length+1];
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j < 3; j++) {
				matches[j][i+1] = matches[j][i];
			}
			matches[moves[i]][i+1]++;
		}
		int[][] matchesB = new int[3][moves.length+1];
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j < 3; j++) {
				matchesB[j][i+1] = matchesB[j][i];
			}
			matchesB[moves[n-i-1]][i+1]++;
		}
		
	

		int ret = 0;
		for(int a = 0; a <=n; a++) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					ret = Math.max(ret, matches[i][a] + matchesB[j][n-a]);
				}
			}
		
		}
		System.out.println(ret);
}
	
    
}