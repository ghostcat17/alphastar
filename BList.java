package alphaStar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("blist.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
		int n  = Integer.valueOf(br.readLine());
		StringTokenizer st;
		int[] s = new int[n];
		int[] t = new int[n];
		int[] b = new int[n];
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine()," ");
			s[i] = Integer.valueOf(st.nextToken());
			t[i] = Integer.valueOf(st.nextToken());
			b[i] = Integer.valueOf(st.nextToken());
		}
		int[] arr = new int[1000];
		for(int i = 0;i<n;i++){
			
			for(int j = s[i];j<t[i];j++){
				arr[j]+=b[i];
			}
		}
		int max = 0;
		for(int i = 0;i<1000;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		
	pw.println(max);
	br.close();
	pw.flush();
	pw.close();
	}

}
