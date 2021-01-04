package alphaStar;
/*
ID: justin72
LANG: JAVA
TASK: sort3
*/

import java.io.*;
import java.util.Arrays;

public class sort3 {
	public static void main(String[] args) throws NumberFormatException, IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("sort3.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("sort3.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.valueOf(br.readLine());
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = Integer.valueOf(br.readLine());
		}
		
		pw.println(solve(arr));
		
		pw.flush();
		pw.close();
		
			
	}
	public static int solve(int[] arr){
		int count1 = count(arr,1);
		int count2 = count(arr,2);
		int count3 = count(arr,3);
		for(int i = 0;i<arr.length;i++){
			
		}
	}
	public static int count(int[] arr, int num){
		int ret = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==num){
				ret++;
			}
		}
		return ret;
		
	}


}
