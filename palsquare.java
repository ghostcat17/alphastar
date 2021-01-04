
/*
ID: justin72
LANG: JAVA
TASK: palsquare
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class palsquare {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("palsquare.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("palsquare.out")));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[300];
		for(int i = 1;i<=300;i++){
			arr[i-1] = i*i;
		}
		char[] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J'};
		for(int i = 0;i<arr.length;i++){
			String current = convert(n, arr[i], a);
			if(isPal(current)){
				pw.println(convert(n,i+1,a)+" "+current);
			}
		}
		
		pw.flush();
		pw.close();
		br.close();
	}
	public static boolean isPal(String num){
		int middle = num.length()/2;
		for(int i = 0;i<middle;i++){
			
			if(num.charAt(i)!=num.charAt(num.length()-i-1))return false;
		}
		return true;
	}
	public static String convert(int n, int r, char[] a){
		StringBuilder sb = new StringBuilder();
		while(r>0){
			sb.insert(0, a[r%n]);
			r/=n;
			
		}
		return sb.toString();
		
	}

}
