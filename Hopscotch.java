package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Hopscotch {
	static Set<String> set = new HashSet<String>();
	static String[][] board = new String[5][5];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int k =0;k<5;k++){
			st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<5;i++){
			board[k][i] = st.nextToken();
		}
		}
		for(int i = 0;i<5;i++){
			for(int j = 0;j<5;j++){
				solve(1,i,j,"");
			}
		}
		
		System.out.println(set.size());
	}
	public static void solve(int k,int x, int y,String current){
		if(x<0||y<0||x>=5||y>=5)return;
		if(k==6){
			set.add(current+board[x][y]);
			
			return;
		}
		
			
			solve(k+1,x+1,y,current+board[x][y]);
		
	
			solve(k+1,x-1,y,current+board[x][y]);
		
		
			solve(k+1,x,y+1,current+board[x][y]);
		
			solve(k+1,x,y-1,current+board[x][y]);
		
		
	}
	
}
