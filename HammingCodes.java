package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HammingCodes {
	private static int n;
	private static int b;
	private static int d;
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lineup.in")));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("lineup.out")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.valueOf(st.nextToken());
		b = Integer.valueOf(st.nextToken());
		d = Integer.valueOf(st.nextToken());
		int i = 0;
		int[] arr = new int[n];
		n = 16;
		b = 7;
		d = 3;
		
	}
	
	
			
	//public static boolean hamming(int x, int y, int max){
		//Integer.toBinaryString(x);
	//}


}
