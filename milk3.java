/*
ID: justin72
LANG: JAVA
TASK: milk3
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class milk3 {
	private static boolean[][] searched;
	private static int a,b,c;
	private static boolean[] amount;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("milk3.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("milk3.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		searched = new boolean[21][21];
		amount = new boolean[21];
		a = Integer.valueOf(st.nextToken());
		b = Integer.valueOf(st.nextToken());
		c = Integer.valueOf(st.nextToken());
		StringBuilder sb = new StringBuilder();
		dfs(0,0,c);
		
		for(int i = 0;i<amount.length;i++){
			 if (amount[i]) 
				    sb.append(i + " ");
		}
		
		pw.println(sb.toString().trim());
		pw.flush();
		pw.close();
		br.close();

	}
	 private static void dfs(int x, int y, int z){
		
		  if(searched[x][y]) return;
		  searched[x][y] = true;
		  if(x == 0) amount[z] = true;
		  if (x>0 && y<b) 
		   dfs(Math.max(0,x+y-b),Math.min(b,x+y),z);
		  if (x>0 && z<c) 
		   dfs(Math.max(0,x+z-c),y,Math.min(c,x+z));
		  if (y>0 && x<a)
		   dfs(Math.min(a,y+x),Math.max(0,y+x-a),z);
		  if (y>0 && z<c) 
		   dfs(x,Math.max(0,y+z-c), Math.min(c,y+z));
		  if (z>0 && x<a) 
		   dfs(Math.min(a,z+x),y,Math.max(0,z+x-a));
		  if (z>0 && y<b) 
		   dfs(x,Math.min(b,z+y),Math.max(0,z+y-b));
		 }
}
