
/*
ID: justin72
LANG: JAVA
TASK: numtri
*/

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class numtri {
	static int[][] visited;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("numtri.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("numtri.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		int[][] arr = new int[n][n];
		
		for(int i = 1;i<=n;i++){
			StringTokenizer st= new StringTokenizer(br.readLine());
			for(int j = 0;j<i;j++){
				
				arr[i-1][j] = Integer.valueOf(st.nextToken());
			}
		}
		visited = new int[arr.length][arr.length];
	
		for(int i = n-2;i>=0;i--){
			for(int j = 0;j<n-1;j++){
				arr[i][j]+=Integer.max(arr[i+1][j], arr[i+1][j+1]);
			}
		}
		pw.println(arr[0][0]);
		pw.flush();
		pw.close();
		br.close();
	}
	
	public static int max(int[][] arr, int i, int j){
		if(i>arr.length-1){
			return 0;
		}
		if(visited[i][j]!=-1){
			return arr[i][j];
		}
		if(i<=arr.length-1){
			
			return visited[i][j] = arr[i][j]+Integer.max(max(arr,i+1,j), max(arr,i+1,j+1));
		}
		return 0;
	
		
	}
}
