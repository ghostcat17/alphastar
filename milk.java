

/*
ID: justin72
LANG: JAVA
TASK: milk
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class milk {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("milk.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("milk.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int milk = Integer.valueOf(st.nextToken());
		int farmers = Integer.valueOf(st.nextToken());
		Pair[] arr = new Pair[farmers];
		for(int i = 0;i<farmers;i++){
			st = new StringTokenizer(br.readLine());
			arr[i] = new Pair(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
			
		}
		Arrays.sort(arr);
		int count = 0;
		int money = 0;
		int i = 0;
		while(count!=milk){
			count+=arr[i].y;
			money+=arr[i].x*arr[i].y;
			
			if(count>milk){
				int extra = count-milk;
				count-=extra;
				money-=arr[i].x*extra;
			}
			i++;
			
		}
		pw.println(money);
		pw.flush();
		pw.close();
		
	}
	public static class Pair implements Comparable<Pair>{
		int x;
		int y;
		public Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public int compareTo(Pair o) {
			
			return this.x-o.x;
		}
		
	}

}
