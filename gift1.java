/*
ID: justin72
LANG: JAVA
TASK: gift1
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class gift1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("gift1.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("gift1.out")));
		int n = Integer.valueOf(br.readLine());
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		String[] arr = new String[n];
		for(int i = 0;i<n;i++){
			String current = br.readLine();
			map.put(current, 0);
			arr[i] = current;
			
		}
		StringTokenizer st = null;
		for(int i = 0;i<n;i++){
			String current = br.readLine();
			st = new StringTokenizer(br.readLine());
			int money = Integer.valueOf(st.nextToken());
			int people = Integer.valueOf(st.nextToken());
			if(people!=0){
			map.put(current, map.get(current)-(money-(money%people)));
			for(int j = 0;j<people;j++){
				String person = br.readLine();
				map.put(person,map.get(person)+(money/people));
			}
		}
		}
		for(int i = 0;i<n;i++){
			pw.print(arr[i]+" ");
			pw.println(map.get(arr[i]));
		}
		pw.flush();
		pw.close();
		br.close();
	}
	

}
