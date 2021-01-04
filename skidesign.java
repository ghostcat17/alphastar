
/*
ID: justin72
LANG: JAVA
TASK: skidesign
*/


import java.io.*;
import java.util.Arrays;

public class skidesign {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("skidesign.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("skidesign.out")));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(arr);
		
		int ret = Integer.MAX_VALUE;
		if(arr[n-1]-arr[0]==17){
			ret = 0;
			
		}
		for(int i = arr[0];i<=arr[arr.length-1]&&arr[n-1]-i>17;i++){
			
			int count = 0;
			for(int j = 0;j<arr.length;j++){
				
				int max = i+17;
				
				if (arr[j]>max) {
					count+=(max-arr[j])*(max-arr[j]);
				} else if (arr[j]<i) {
					count+=(arr[j]-i)*(arr[j]-i);
				}
			}
			ret = Math.min(count, ret);
		}
		pw.println(ret);
		pw.flush();
		pw.close();
		br.close();

	}
	public static int calc(int i, int[] arr, int j){
		
		int ret = 0;
		for(int a = i;a>=0;a--){
			
			ret+=(j-arr[a])*(j-arr[a]);
		}
		return ret;
	}
public static int calc2(int i, int[] arr, int j){
		
		int ret = 0;
		for(int a = i;a<arr.length;a++){
			
			ret+=(arr[a]-j)*(arr[a]-j);
		}
		return ret;
	}
	public static Pair small(int n){
		return new Pair((n/2*n/2), (n-(n/2))*(n-(n/2)));
	}
	public static class Pair{
		int x;
		int y;
		public Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

}
