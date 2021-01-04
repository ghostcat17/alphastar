package alphaStar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CowBeautyPagentII {

	public static void main(String[] args) {
		solve();
		
				

	}
	public static void solve(){
		Scanner br = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(br.nextLine());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int[][] arr = new int[a][b];
		
		for(int i = 0;i<a;i++){
			String current = br.nextLine();
			for(int j = 0;j<b;j++){
				
				if(current.charAt(j)=='.'){
					arr[i][j] = -2;
				}
				else{
					arr[i][j] = -1;
				}
			}
		}
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				
				if(arr[i][j]==-1){
					count++;
					LinkedList<Integer> xq = new LinkedList<Integer>();
					LinkedList<Integer> yq = new LinkedList<Integer>();

					int[] dx = {-1,0,1,0};//LURS
					int[] dy = {0,-1,0,1};//LURS

					
					
					xq.add(i);
					yq.add(j);
					arr[i][j] = count;
				
					while(!xq.isEmpty()){
						int x = xq.remove();
						int y = yq.remove();
						for(int dir = 0;dir<4;dir++){

							if(x+dx[dir]==-1||y+dy[dir]==-1||x+dx[dir]==a||y+dy[dir]==b){
								continue;
							}
							if(arr[x+dx[dir]][y+dy[dir]]==-1){

								xq.add(x+dx[dir]);
								yq.add(y+dy[dir]);

								arr[x+dx[dir]][y+dy[dir]] = count;
								
								
							}
							else{
								continue;
							}
						}

					}
				}
			}
		}
		print(arr);
		
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				
				if(arr[i][j]==1){
					int current = 0;
					LinkedList<Integer> xq = new LinkedList<Integer>();
					LinkedList<Integer> yq = new LinkedList<Integer>();

					int[] dx = {-1,0,1,0};//LURS
					int[] dy = {0,-1,0,1};//LURS

					
					
					xq.add(i);
					yq.add(j);
					arr[i][j] = count;
				
					while(!xq.isEmpty()){
						int x = xq.remove();
						int y = yq.remove();
						for(int dir = 0;dir<4;dir++){

							if(x+dx[dir]==-1||y+dy[dir]==-1||x+dx[dir]==arr.length||y+dy[dir]==arr[i].length){
								continue;
							}
							if(arr[x+dx[dir]][y+dy[dir]]==-2){

								xq.add(x+dx[dir]);
								yq.add(y+dy[dir]);

								arr[x+dx[dir]][y+dy[dir]] = count++;
								
								
							}
							else{
								continue;
							}
						}

					}

				}
		
		
			}
		}
		print(arr);
	}
		

	
	public static void print(int[][] arr){
		for(int[] a:arr){
			for(int b:a){
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

}
