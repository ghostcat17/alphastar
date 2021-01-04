package alphaStar;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lake2 {

	public static void main(String[] args) {
		solve();

	}
	public static void solve(){
		Scanner br;
		br = new Scanner(System.in);
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		int temp = 0;
		String line = "";
		String current;
		StringTokenizer st = new StringTokenizer(br.nextLine()," ");
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		int count = 0;
		int[][] asters = new int[n][m];
		int[] dx = {-1,0,1,0};//RDLU
		int[] dy = {0,1,0,-1};//RDLU
		
		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
				asters[i][j] = -2;
			}
		}
		for(int i = 0;i<k;i++){
			line = br.nextLine();
			st = new StringTokenizer(line," ");
			asters[Integer.valueOf(st.nextToken())-1][Integer.valueOf(st.nextToken())-1] = -1;
		}
		
		
		for(int i = 0;i<asters.length;i++){
			for(int j = 0;j<asters[i].length;j++){
				temp = 0;
				if(asters[i][j]==-1){
					
					xq.add(i);
					yq.add(j);
					
					while(!xq.isEmpty()){
						int x = xq.remove();
						int y = yq.remove();
						for(int dir = 0;dir<4;dir++){
							
							if(x+dx[dir]==-1||y+dy[dir]==-1||x+dx[dir]==n||y+dy[dir]==m){
								continue;
							}
							if(asters[x+dx[dir]][y+dy[dir]]==-1){
								
								xq.add(x+dx[dir]);
								yq.add(y+dy[dir]);
								temp++;
								asters[x+dx[dir]][y+dy[dir]] = 0;
							}
							else{
								continue;
							}
						}
						
					}
				}
				if(temp>count)count = temp;
			}
		}
		
		
		
		
		
		System.out.println(count);
	}
	

}
