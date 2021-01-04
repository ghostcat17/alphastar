
/*
ID: justin72
LANG: JAVA
TASK: milk2
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
import java.util.StringTokenizer;

public class milk2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("milk2.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("milk2.out")));
		int n = Integer.valueOf(br.readLine());
		interval[] arr = new interval[n];
		StringTokenizer st;
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			arr[i] = new interval(Integer.valueOf(st.nextToken()),Integer.valueOf(st.nextToken()));
			
		}
		Arrays.sort(arr);
		int milk = 0, nomilk = 0;
		int current = 0;
		for(int i = 0;i<n;i++){
			if(current!=i&&arr[current].b>=arr[i].a){
				
				if(arr[current].b<arr[i].b){
					arr[current].b = arr[i].b;
				}
				
				
			}
			else{
				
				
				if(nomilk<arr[i].a-arr[current].b){
					System.out.println(arr[i].a);
					System.out.println(arr[i].b);
					
					nomilk = arr[i].a-arr[current].b;
				}
				if(milk<arr[current].b-arr[current].a){
					milk = arr[current].b-arr[current].a;
					
				}
				current = i;
				
				
			}
		}
		
		pw.println(milk+" "+nomilk);
		pw.flush();
		pw.close();
		br.close();
		
	}
	public static class interval implements Comparable<interval>{
		int a;
		int b;
		public interval(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int compareTo(interval o) {
			
			return this.a-o.a;
		}
		
	}
}
