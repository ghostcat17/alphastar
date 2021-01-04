package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;



public class milkvisits {
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("whereami.in")));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("whereami.out")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		char[] cows = new char[n];
		String line = br.readLine();
		for(int i = 0;i<n;i++){
			cows[i] = line.charAt(i);
		}
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			map.put(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
			
		}
		
		
		
		
	}
	public static void getComponent(ArrayList<ArrayList<Integer>> arr,HashMap<Integer,Integer> map, int n){
		int[] list = new int[n];
		
		for(int i = 0;i<n;i++){
			list[i] = i+1;
		}
		
	}
}
