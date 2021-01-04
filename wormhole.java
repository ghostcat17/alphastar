
/*
ID: justin72
LANG: JAVA
TASK: wormhole
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class wormhole {
	static int[] right;
	static Pair[] arr;
	static int n;
	static int count = 0;
	static int[] partner;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("wormhole.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("wormhole.out")));
		n = Integer.valueOf(br.readLine());
		right = new int[n+1];
		arr = new Pair[n+1];
		for(int i = 1;i<=n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = new Pair(Integer.valueOf(st.nextToken()),Integer.valueOf(st.nextToken()));
			
		}
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n;j++){
				if(arr[i].y==arr[j].y&&arr[i].x<arr[j].x){
					if (right[i] == 0 ||
						    arr[j].x-arr[i].x < arr[right[i]].x-arr[i].x)
						  
					right[i] = j;
				}
			}
		}
		
		partner = new int[n+1];
		
		pw.println(solve());
		pw.flush();
		pw.close();
		br.close();
	}
	public static int solve(){
		int a;
		int total = 0;
		for(a = 1;a<arr.length;a++){
			if(partner[a]==0){
				break;
			}
		}
		if(a>n){
			
			if(cycle())return 1;
			return 0;
		}
		for(int i = a+1;i<arr.length;i++){
			
			if(partner[i]==0){
			partner[a] = i;
			partner[i] = a;
			total +=solve();
			partner[i] = partner[a] = 0;
			}
			
		}
		return total;
		
	}
	public static boolean cycle(){
		
		for(int i = 1;i<partner.length;i++){
			int pos = i;
			for(int j = 0;j<n;j++){
				pos = right[partner[pos]];
			}
			if(pos!=0)return true;
			
		}
		return false;
	}
	public static class Pair{
		int x;
		int y;
		public Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		public String toString(){
			return x+":"+y;
		}
	}

}
