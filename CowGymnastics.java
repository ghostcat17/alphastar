

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CowGymnastics {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("gymnastics.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("gymnastics.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		int[][] arr = new int[k][n];
		
		for(int i = 0;i<k;i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<n;j++){
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		Set<Integer> set = new HashSet<Integer>();

		
		int num = 0;
		for(int j = 1;j<=n;j++){
			set.clear();
			for(int i = 0;i<arr.length;i++){
			
			
				if(i==0){
					set = after(arr[i],j);
				}
				else{
					set.retainAll(after(arr[i],j));
					}
				
			}
			num+=set.size();
		}
		
		pw.println(num);
		pw.flush();
		pw.close();
		
		
	}
	public static Set<Integer> after(int[] arr, int num){
		Set<Integer> set = new HashSet<Integer>();
		int i = 0;
		while(arr[i]!=num)i++;
		while(i<arr.length-1){
			i++;
			set.add(arr[i]);
			
		}
		return set;
	}
}
