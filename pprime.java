
/*
ID: justin72
LANG: JAVA
TASK: pprime
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class pprime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("pprime.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("pprime.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int d1; int d2; int d3;
		int d4;
		int palindrome;
		System.out.println(prime(9));
		for(d1 = 1;d1<=9;d1+=2){
			palindrome = d1;
			if(d1>b){
				break;
			}
			else if(d1>=a&&prime(palindrome)){
				pw.println(d1);
			}
		}
		for(d1 = 1;d1<=9;d1+=2){
			palindrome = d1*10+d1;
			
			if(palindrome>b){
				break;
			}
			else if(palindrome>=a&&prime(palindrome)){
				pw.println(palindrome);
			}
		}
		
		for(d1 = 1;d1<=9;d1+=2){
			for(d2 = 0;d2<=9;d2++){
				
			
			palindrome = d1*100+d2*10+d1;
			if(palindrome>b){
				break;
			}
			else if(palindrome>=a&&prime(palindrome)){
				pw.println(palindrome);
			}
			}
		}
		
		for(d1 = 1;d1<=9;d1+=2){
			for(d2 = 0;d2<=9;d2++){
				
			
			palindrome = d1*1000+d2*100+d2*10+d1;
			if(palindrome>b){
				break;
			}
			else if(palindrome>=a&&prime(palindrome)){
				pw.println(palindrome);
			}
			}

		}
		
	
		
		/* generate five digit palindrome: */
		for (d1 = 1; d1 <= 9; d1+=2) {	/* only odd; evens aren't so prime */
		    for (d2 = 0; d2 <= 9; d2++) {
		        for (d3 = 0; d3 <= 9; d3++) {
			    palindrome = 10000*d1 + 1000*d2 +100*d3 + 10*d2 + d1;
			    if(palindrome>b){
					break;
				}
				else if(palindrome>=a&&prime(palindrome)){
					pw.println(palindrome);
				}
				}
			   
			
		    }
		}
		
		for(d1 = 1;d1<=9;d1+=2){
			for(d2 = 0;d2<=9;d2++){
				
			for(d3 = 0;d3<=9;d3++){
			palindrome = d1*100000+d2*10000+d3*1000+d3*100+d2*10+d1;
			if(palindrome>b){
				break;
			}
			else if(palindrome>=a&&prime(palindrome)){
				pw.println(palindrome);
			}
			}
			}

		}
		for(d1 = 1;d1<=9;d1+=2){
			for(d2 = 0;d2<=9;d2++){
				
			for(d3 = 0;d3<=9;d3++){
				for(d4 = 0;d4<=9;d4++){
					
				
			palindrome = d1*1000000+d2*100000+d3*10000+d4*1000+d3*100+d2*10+d1;
			if(palindrome>b){
				break;
			}
			else if(palindrome>=a&&prime(palindrome)){
				pw.println(palindrome);
			}
			}
			}

		}
		}
		for(d1 = 1;d1<=9;d1+=2){
			for(d2 = 0;d2<=9;d2++){
				
			for(d3 = 0;d3<=9;d3++){
				for(d4 = 0;d4<=9;d4++){
					
				
			palindrome = d1*10000000+d2*1000000+d3*100000+d4*10000+d4*1000+d3*100+d2*10+d1;
			if(palindrome>b){
				break;
			}
			else if(palindrome>=a&&prime(palindrome)){
				pw.println(palindrome);
			}
			}
			}

		}
		}
		pw.flush();
		pw.close();
		}
	public static boolean prime(int a){
		for(int i = 2;i<=Math.sqrt(a);i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}

}
