
/*
ID: justin72
LANG: JAVA
TASK: castle
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class castle {

	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("castle.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("castle.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		int[][] arr = new int[x][y];
		for(int i = 0;i<y;i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<x;j++){
				arr[j][i] = Integer.valueOf(st.nextToken());
			}
		}
		
	
		boolean[][][] vals = new boolean[x][y][4];
		assign(arr,vals);
		int max = 0;
	
		for(int i = 0;i<arr.length;i++){

			for(int j = 0;j<arr[i].length;j++){
				arr[i][j] = -1;

			}
		}
		int count = 0;
		int temp = 0;
		for(int i = 0;i<arr.length;i++){

			for(int j = 0;j<arr[i].length;j++){
				if(arr[i][j]==-1){
					count++;
					
					temp = room(arr,i,j,vals,count);
					if(temp>max){
						max = temp;
					}
				}

			}
			
		}
		int px= 0;
		int py = 0;
		char pd = '0';
	
		int bigroom = -1;
		String big = "";
		for(int i = 0;i<arr.length;i++){
			for(int j = arr[0].length-1;j>=0;j--){
				

				for(int k = 0;k<dx.length;k++){
				
					if(i+dx[k]<0||i+dx[k]>arr.length-1||j+dy[k]<0||j+dy[k]>arr[i].length-1){
						continue;
					}
					else{
						if(arr[i+dx[k]][j+dy[k]]!=arr[i][j]){

							int current = count(arr,arr[i][j])+count(arr,arr[i+dx[k]][j+dy[k]]);
							 
							if(current>bigroom){
								big = (j+1)+" "+(i+1)+" "+dir(k);
								bigroom = current;
								px = i;
								py = j;
								pd = dir(k);
							}

							if(current==bigroom&&dir(k)=='N'&&pd=='E'&&i<=px&&j>=py){
								big = (j+1)+" "+(i+1)+" "+dir(k);
								bigroom = current;
								
							}
							
						}
					}
				}
			}
		}

		
	
		pw.println(count);
		pw.println(max);
		pw.println(bigroom);
		pw.println(big);
		pw.flush();
		pw.close();
		br.close();
	}
	public static char dir(int x){
		if(x == 0){
			return 'S';
		}
		if(x == 1){
			return 'E';
		}
		if(x == 2){
			return 'N';
		}
		else{
			return 'W';
		}
	}
	public static int room(int[][] arr, int a, int b, boolean[][][] vals, int val){
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		

		int count = 1;
		
		xq.add(a);
		yq.add(b);
		arr[a][b] = val;
	
		while(!xq.isEmpty()){
			int x = xq.remove();
			int y = yq.remove();
			for(int dir = 0;dir<4;dir++){

				if(x+dx[dir]==-1||y+dy[dir]==-1||x+dx[dir]==arr.length||y+dy[dir]==arr[a].length){
					continue;
				}
				if(connected(x,y,dir,vals)&&arr[x+dx[dir]][y+dy[dir]]==-1){

					xq.add(x+dx[dir]);
					yq.add(y+dy[dir]);
					
					arr[x+dx[dir]][y+dy[dir]] = val;
					++count;
					
				}
				else{
					continue;
				}
			}

		}
		return count;
	
	}

	public static int count(int[][] arr, int num){
		int count = 0;
		for(int[] a:arr){
			for(int b:a){
				if(b==num){
					count++;
				}
			}
		}
		return count;
	}
	public static void assign(int[][] arr, boolean[][][] vals){

		
		int[] val = {8,4,2,1};
		for(int i = 0;i<vals.length;i++){
			for(int j = 0;j<vals[i].length;j++){
				int current = arr[i][j];
				
				
				for(int l = 0;l<val.length;l++){
					if(current-val[l]>=0){
						
						current-=val[l];
						vals[i][j][l] = true;
					}
				}
			}
		}
	}
	public static boolean connected(int i, int j,int dir, boolean[][][] vals){
	
		int a = i+dx[dir];
		int b = j+dy[dir];
		
		
		if(!vals[i][j][dir]&&!vals[a][b][(dir+2)%4]){
			
			return true;
		}
		return false;
	}

}




