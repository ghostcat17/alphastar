package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Munch {
	public static void main(String[] args) throws IOException{
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.valueOf(st.nextToken()), n = Integer.valueOf(st.nextToken());
		int count = 0;
		int[][] asters = new int[m][n];
		int[] dx = {-1,0,1,0};//RDLU
		int[] dy = {0,1,0,-1};//RDLU
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		int x,y;
		int current;
		String line;
		int temp = 0,temp1 = 0;
		for(int i = 0;i<m;i++){
			line = br.readLine();
			for(int j = 0;j<n;j++){
					if(line.charAt(j)=='.'){
						asters[i][j] = -2;
					}
					if(line.charAt(j)=='*'){
						asters[i][j] = -1;
					}
				if(line.charAt(j) == 'B'){
					xq.add(i);
					yq.add(j);
					asters[i][j] = 0;
				}
				if(line.charAt(j)=='C'){
					temp = i;
					temp1 = j;
				}
				
				
				
			}
		}
		
		while(!xq.isEmpty()){
			
			x = xq.removeFirst();
			y = yq.removeFirst();
			for(int dir = 0;dir<4;dir++){
				if(x+dx[dir]==-1||y+dy[dir]==-1||x+dx[dir]==m||y+dy[dir]==n){
					continue;
				}

				if(asters[x+dx[dir]][y+dy[dir]]==-2||asters[x+dx[dir]][y+dy[dir]]==0){
					
					xq.add(x+dx[dir]);
					yq.add(y+dy[dir]);
					
					asters[x+dx[dir]][y+dy[dir]] = asters[x][y]+1;
				}
				else{
					continue;
				}
			}
		}
		
		
		
		System.out.println(asters[temp][temp1]);

		
	}
}
