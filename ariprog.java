
/*
ID: justin72
LANG: JAVA
TASK: ariprog
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ariprog {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("ariprog.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("ariprog.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
	int m = Integer.valueOf(br.readLine());
	ArrayList<Pair> list = new ArrayList<Pair>(); 
	boolean[] arr = new boolean[m*m*2+1];
	for(int i = 0;i<=m;i++){
		for(int j = 0;j<=m;j++){
			arr[i*i+j*j] = true;
		}
	}
	for(int i = 0;i<(m*m*2);i++){
		label:
		for(int j=1;j<=(m*m*2-i)/(n-1);j++){
			for(int a = 0;a<n;a++){
				if(!arr[i+a*j]){
					continue label;
				}
			}
		
				
				list.add(new Pair(i,j));
				
			}
		}
	
	Collections.sort(list);
	for(int i = 0;i<list.size();i++){
		pw.println(list.get(i).x+" "+ list.get(i).y);
	}
	if(list.size()==0){
		pw.println("NONE");
	}
	pw.flush();
	pw.close();
	br.close();

	}
	public static boolean check(int i, int j, int n, int m){
		for(int a = 0;a<n;a++){
			
			
			if(!bisquare(i+a*j,m)){
				
				return false;
			}
		}
		return true;
	}
	 public static boolean bisquare(int n, int m) 
	    { 
	        for (int i = 0; i * i <= n; i++) 
	            for (int j = i; j * j <= n; j++) 
	            	
	                if (i * i + j * j == n&&i<=m&&j<=m) { 
	                
	                    return true; 
	     } 
	  
	        return false; 
	    } 
	 public static class Pair implements Comparable<Pair>{
			int x;
			int y;
			public Pair(int x, int y){
				this.x = x;
				this.y = y;
			}
		
			public int compareTo(Pair o) {
				
				return this.y-o.y;
			}
		}
	 
}
