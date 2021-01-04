package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlumbingTheRoad {

	public static void main(String[] args) throws IOException {
		int x, y;
		BufferedReader br;
		String line;
		br = new BufferedReader(new InputStreamReader(System.in));
	
		line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		x = Integer.valueOf(st.nextToken());
		y = Integer.valueOf(st.nextToken());
		
		
		int[][] sec = new int[x+2][y+2];
		
		int[][] original = new int[x][y];
		
		for(int i = 0;i<x;i++){
			line = br.readLine();
			StringTokenizer st2 = new StringTokenizer(line, " ");
			for(int j = 0;j<y;j++){
				original[i][j] = Integer.valueOf(st2.nextToken());
			}
			
			
		}
		
		
		int sum = -1000000;
		int largest = -1000000;
		for(int i = 0;i<sec.length;i++){
			for(int j = 0;j<sec[i].length;j++){
				if(i == 0||j==0||i==sec.length-1||j==sec[i].length-1){
					sec[i][j] = 0;
				}
				else{
					sec[i][j] = original[i-1][j-1];
				}
			}
		}
		for(int i = 0;i<sec.length;i++){
			for(int j = 0;j<sec[i].length;j++){
				System.out.print(sec[i][j]);
			}
			System.out.println();
			}
		
		for(int i = 0;i<original.length;i++){
			for(int j = 0;j<original[i].length;j++){
				for(int l = 0;l<5;l++){
						
							if(l == 0){//right
								if(sec[i+1][j+1]==sec[i+2][j+1]){
									sum = sec[i+1][j+1];
									
								}
								
							}
							if(l == 1){//diagonal down right
								if(sec[i+1][j+1]==sec[i+2][j]){
									sum = sec[i+1][j+1];
									
								}
								
							}
							if(l == 2){//down
								if(sec[i+1][j+1]==sec[i+1][j+2]){
									sum = sec[i+1][j+1];
									
								}
								
							}
							if(l == 3){
								if(sec[i+1][j+1]==sec[i][j+2]){
									sum = sec[i+1][j+1];
								}
								
							}
							if(l == 4){
								if(sec[i+1][j+1]==sec[i][j]){
									sum = sec[i+1][j+1];
								}								
							}
							
							if(sum>largest)largest = sum;
							
						
					}
				}
			}
		
		System.out.println(largest);
	}

	}


