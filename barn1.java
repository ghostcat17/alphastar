
/*
ID: justin72
LANG: JAVA
TASK: barn1
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class barn1 {

	

	public static void main(String[] args) throws IOException {
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("barn1.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("barn1.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.valueOf(st.nextToken());
		int s = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		int[] arr = new int[c];
		for(int i = 0;i<c;i++){
			arr[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(arr);
		int[] gaps = new int[c-1];
		for(int i = 1;i<arr.length;i++){
			gaps[i-1] = arr[i]-arr[i-1];
		}
		Arrays.sort(gaps);
	
		 int sum=Math.min(m,c);
		for(int i = 0;i<=gaps.length-m;i++){
			sum+=gaps[i];
		}
		 pw.println(sum);
		 pw.flush();
	     pw.close();
	     br.close();
	}
	
	
}
