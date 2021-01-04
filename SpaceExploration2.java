package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class SpaceExploration2 {

	public static void main(String[] args) throws Exception {
		solve();

	}
	
	public static void solve() throws NumberFormatException, IOException{
		Scanner br;
		br = new Scanner(System.in);
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		String line = "";
		String current;
		int n = Integer.valueOf(br.nextLine());
		
		StringTokenizer st;
		int count = 0;
		int[][] asters = new int[n][n];
		int[] dx = {-1,0,1,0};//RDLU
		int[] dy = {0,1,0,-1};//RDLU
		
		for(int i = 0;i<n;i++){
			line = br.nextLine();
			for(int j = 0;j<n;j++){
					if(line.charAt(j)=='.'){
						asters[i][j] = -2;
					}
					if(line.charAt(j)=='*'){
						asters[i][j] = -1;
					}
				
				
			}
		}
		
		
		for(int i = 0;i<asters.length;i++){
			for(int j = 0;j<asters[i].length;j++){
				if(asters[i][j]==-1){
					count++;
					xq.add(i);
					yq.add(j);
					while(!xq.isEmpty()){
						int x = xq.remove();
						int y = yq.remove();
						for(int dir = 0;dir<4;dir++){
							
							if(x+dx[dir]==-1||y+dy[dir]==-1||x+dx[dir]==n||y+dy[dir]==n){
								continue;
							}
							if(asters[x+dx[dir]][y+dy[dir]]==-1){
								
								xq.add(x+dx[dir]);
								yq.add(y+dy[dir]);
								
								asters[x+dx[dir]][y+dy[dir]] = count;
							}
							else{
								continue;
							}
						}
						
					}
				}
			}
		}
		
		
		
		System.out.println(count);
	}
	
}
