

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class MilkFactory {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		solve();
	}
	public static void solve() throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("factory.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("factory.out")));
		
		int n = Integer.valueOf(br.readLine());
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 1;i<n;i++){
			StringTokenizer st= new StringTokenizer(br.readLine());
			map.put(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
			
		}
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				int current = j+1;
				
				while(map.containsKey(current)){
					
					current = map.get(current);
					if(current-1==i){
						
						arr[i]++;
						break;
					}
					
				}
			}
			
			
		}
		for(int i = 0;i<n;i++){
			if(arr[i]==n-1){
				pw.println(i+1);
				pw.flush();
				pw.close();
				br.close();
			}
			
		}
		pw.println(-1);

		pw.flush();
		pw.close();
		pw.close();
		
	}

}
