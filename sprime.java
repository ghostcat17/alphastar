/*
ID: justin72
LANG: JAVA
TASK: sprime
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class sprime {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("sprime.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("sprime.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		int[] digits = new int[9];
		for(int i = 0;i<digits.length;i++){
			digits[i] = i+1;
		}
		
		generate(digits,0,n,-1,pw);
		pw.flush();
		pw.close();

	}
	public static void generate(int[] arr, int n, int num, int curr, PrintWriter pw){
		
		if(curr>=num-1){
			pw.println(n);
			return;
		}
		for(int i = 0;i<arr.length;i++){
			
			int a = n*10+arr[i];
			
			if(prime(a)){
				generate(arr,a,num,curr+1,pw);
			}
		}
	}
	public static boolean prime(int a){
		if(a==1){
			return false;
		}
		for(int i = 2;i<=Math.sqrt(a);i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}

}
