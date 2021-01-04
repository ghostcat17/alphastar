/*
ID: justin72
LANG: JAVA
TASK: transform
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

public class transform {
	static BufferedReader br;
	static PrintWriter pw;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		br = new BufferedReader(new InputStreamReader(new FileInputStream("transform.in")));
		pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("transform.out")));
		int n = Integer.valueOf(br.readLine());
		char[][] org = new char[n][n];
		for(int i = 0;i<n;i++){
			String current = br.readLine();
			for(int j = 0;j<n;j++){
			org[i][j] = current.charAt(j);
				
			}
		}
		
		char[][] ret = new char[n][n];
		for(int i = 0;i<n;i++){
			String current = br.readLine();
			for(int j = 0;j<n;j++){
			ret[i][j] = current.charAt(j);
				
			}
			
		}
		
		if(equals(r90(org),ret)){
			pw.println(1);
		}
		else if(equals(r90(r90(org)),ret)){
			pw.println(2);
		}
		else if(equals(r90(r90(r90(org))),ret)){
			pw.println(3);
		}
		else if(equals(reflect(org),ret)){
			pw.println(4);
		}
		else if(equals(reflect(r90(org)),ret)){
			pw.println(5);
		}
		else if(equals(reflect(r90(r90(org))),ret)){
			pw.println(5);
		}
		else if(equals(reflect(r90(r90(r90(org)))),ret)){
			pw.println(5);
		}
		else if(equals(org,ret)){
			pw.println(6);
		}
		else{
			pw.println(7);
		}
		pw.flush();
		pw.close();
		br.close();
		
		
		
	}
	public static char[][] reflect(char[][] input){
		 char[][] ret = new char[input.length][input.length];
	        for(int i=0; i<input.length; i++) {
	            for(int j=0; j<input.length; j++) {
	                ret[i][j] = input[i][input.length-j-1];
	            }
	        }
	        return ret;
	    }
	public static char[][] r90(char[][] input){
		 char[][] ret = new char[input.length][input.length];
	        for(int i=0; i<input.length; i++) {
	            for(int j=0; j<input.length; j++) {
	                ret[j][input.length-i-1] = input[i][j];
	            }
	        }
	        return ret;
	} 
	 public static boolean equals(char[][] arr1, char[][] arr2) {
		 for(int i = 0;i<arr1.length;i++){
			 for(int j = 0;j<arr1[i].length;j++){
				 if(arr1[i][j]!=arr2[i][j]){
					 return false;
				 }
			 }
		 }
		return true;
		    }
		
	public static void print(char[][] arr){
		for(char[] a: arr){
			pw.println(Arrays.toString(a));
		}
	}

}
