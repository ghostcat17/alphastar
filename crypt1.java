
/*
ID: justin72
LANG: JAVA
TASK: crypt1
*/

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

public class crypt1 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("crypt1.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("crypt1.out")));
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> array = new HashSet<Integer>();
		for(int i = 0;i<n;i++){
			array.add(Integer.valueOf(st.nextToken()));
			
		}
		int count = 0;
		for(int i = 100;i<=999;i++){
			for(int j = 10;j<=99;j++){
				if(works(i,j,array)){
					count++;
				}
			}
		}
		pw.println(count);
		pw.flush();
		pw.close();
		br.close();
		
		

	}
	
	public static boolean works(int a, int b, Set<Integer> arr){
		
		int[] bb = Integer.toString(b).chars().map(c -> c-'0').toArray();
		
		for(int i = 0;i<3;i++){
			if(!good(a,arr)){
				return false;
			}
		}
		for(int i = 0;i<2;i++){
			if(!good(b,arr)){
				return false;
			}
		}
		for(int i = 0;i<2;i++){
			int current = a*bb[i];
			if(!good(current,arr)||count(current,arr)>3){
				return false;
			}
		}
		
		if(!good(a*b,arr)){
			return false;
		}
		if(count(a*b,arr)>4){
			return false;
		}
	
	return true;
	}
	public static int count(int a, Set<Integer> arr){
		int count = 0;
		while(a>0){
			count++;
			a/=10;
		}
	return count;
	}
	public static boolean good(int a, Set<Integer> arr){
		while(a>0){
			if(!arr.contains(a%10))return false;
			a/=10;
		}
	return true;
	}
	
}


