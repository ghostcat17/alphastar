package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Leprechaun {
	public static void main(String[] args) throws IOException{
		int x, y;
		BufferedReader br;
		String line;
		br = new BufferedReader(new InputStreamReader(System.in));
	
		line = br.readLine();
		
		x = Integer.valueOf(line);
		
		int[][] sec = new int[3*x][3*x];
		
		int[][] original = new int[x][x];
		
		for(int i = 0;i<original.length;i++){
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			for(int j = 0;j<original[i].length;j++){
				original[i][j] = Integer.valueOf(st.nextToken());
			}
			
			
		}
		
		
		int sum = -1000000;
		int largest = -1000000;
			
		for(int l = 0;l<3;l++){
			for(int k = 0;k<3;k++){
		for(int i = 0;i<original.length;i++){
				for(int j = 0;j<original[i].length;j++){
					sec[i+(original.length*l)][j+(original.length*k)] = original[i][j];
				}
			}
			

			}
		
		}
		for(int i = 0;i<original.length;i++){
			for(int j = 0;j<original[i].length;j++){
				for(int l = 0;l<5;l++){
					
					for(int k = 0;k<x;k++){
						sum = 0;
						for(int m = 0; m<k;m++){
							if(l == 0){
								sum+=sec[original.length+i+m][original[i].length+j+m];
								
							}
							if(l == 1){
								sum+=sec[original.length+i+m][original[i].length+j-m];
								
							}
							if(l == 2){
								sum+=sec[original.length+i][original[i].length+j-m];
								
							}
							if(l == 3){
								sum+=sec[original.length+i-m][original[i].length+j-m];
								
							}
							if(l == 4){
								sum+=sec[original.length+i-m][original[i].length+j];
								
							}
							
							if(sum>largest)largest = sum;
							
						}
					}
				}
			}
		}
		System.out.println(largest);
	}
		
	
		
	}
	





