

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BucketBrigade {

	public static void main(String[] args) {
		try {
			solve();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void solve() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("buckets.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("buckets.out")));
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		String line = "";
		String current;
		int n = 0, m = 0;
		int count;
		int[][] asters = new int[10][10];
		int[] dx = {-1,0,1,0};//RDLU
		int[] dy = {0,1,0,-1};//RDLU
		int sx = 0, sy = 0;
		for(int i = 0;i<10;i++){
			String temp1 = br.readLine();
			for(int j = 0;j<10;j++){
				char a = temp1.charAt(j);
				if(a=='.')asters[i][j] = -1;
				else if(a=='B'){
					asters[i][j] = -1;
					n = i;
					m = j;
				}
				else if(a=='L'){
					asters[i][j] = -1;
					sx = i;
					sy = j;
				}
				else{
					asters[i][j] = -3;
				}
				
			}
		}
		xq.add(sx);
		yq.add(sy);
		
	
					while(!xq.isEmpty()){
						int x = xq.remove();
						int y = yq.remove();
						for(int dir = 0;dir<4;dir++){
							
							if(x+dx[dir]==-1||y+dy[dir]==-1||x+dx[dir]==10||y+dy[dir]==10){
								continue;
							}
							if(asters[x+dx[dir]][y+dy[dir]]==-1){
								
								xq.add(x+dx[dir]);
								yq.add(y+dy[dir]);
								
								asters[x+dx[dir]][y+dy[dir]] = asters[x][y]+1;
							}
							else{
								continue;
							}
						}
						
					}
		
		
		
		
		
		
		pw.println(asters[n][m]);
		pw.flush();
		pw.close();
		br.close();
	}

}
