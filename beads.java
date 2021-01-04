
/*
ID: justin72
LANG: JAVA
TASK: beads
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class beads {

	public static void main(String[] args) throws NumberFormatException, IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("beads.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("beads.out")));
		
		int n = Integer.valueOf(br.readLine());
		char[] arr = new char[n*3];
		String neck = br.readLine();
		for(int i = 0;i<n;i++){
			arr[i] = neck.charAt(i);
			arr[i+n] = neck.charAt(i);
			arr[i+(n*2)] = neck.charAt(i);
		}
		int count = 0;
		int max = -1;
		for(int i = 1;i<arr.length-n-1;i++){
			count = count(i,arr);
			if(count>max){
				max = count;
			}
		}
		if(max>n){
			pw.println(n);
		}
		else{
		pw.println(max);
		}
		pw.flush();
		pw.close();
		br.close();
	}
	public static char find(int start, char[] arr){
		for(int i = start;i<arr.length;i++){
			if(arr[i]!='w')return arr[i];
		}
		return 'w';
	}
	public static int count(int start, char[] arr){
		int count = 0;
		int i = start;
		char current = find(start,arr);
		for(i = start; i<arr.length;i++){
			if(arr[i] == current||arr[i]=='w'){
				
				count++;
			}
			else{
				break;
			}
		}
		
		if(current =='r'){
			current = 'b';
		}
		else{
			current = 'r';
		}
		
		while(i<arr.length){
			if(arr[i]==current||arr[i]=='w'){
				
				count++;
			}
			else{
				break;
			}
			i++;
		}
		
		return count;
		
	}

}

