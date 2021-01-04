
/*
ID: justin72
LANG: JAVA
TASK: dualpal
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class dualpal {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("dualpal.in")));
		
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("dualpal.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int s = Integer.valueOf(st.nextToken());
		int count = 0;
	
		char[] a = {'0','1','2','3','4','5','6','7','8','9'};
		for(int i = s+1;count<n;i++){
			int temp = 0;
			for(int j = 2; j<11;j++){
				if(isPal(convert(j,i,a))){
					
					temp++;
					if(temp>=2){
						count++;
						pw.println(i);
						break;
					}
				}
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
