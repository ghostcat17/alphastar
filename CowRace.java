package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CowRace {

	public static void main(String[] args) throws IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());

		int m = Integer.valueOf(st.nextToken());
		int[] bessie = new int[1001000];
		int[] o = new int[1001000];
		int speed = 0,distance = 0;
		int count = 0;
		int curr = 0;
		int b = 0;
		int other = 0;//0 bessie,
		int ret = 0;
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			speed = Integer.valueOf(st.nextToken());
			distance = Integer.valueOf(st.nextToken());
			for(int j = 0;j<distance;j++){
				
				bessie[count] = speed;
				count++;
			}
		}
		count = 0;
		for(int i = 0;i<m;i++){
			st = new StringTokenizer(br.readLine());
			speed = Integer.valueOf(st.nextToken());
			distance = Integer.valueOf(st.nextToken());
			for(int j = 0;j<distance;j++){
				
				o[count] = speed;
				count++;
			}
		}
		for(int i = 0;i<bessie.length;i++){
			b+=bessie[i];
			other+=o[i];
			if (b > other) {
				if (curr == -1) { // leader was elsie
					++ret;
				}
				curr = 1;
				}
			else if (b < other) {
			
				if (curr == 1) { // leader was elsie
					++ret;
				}
				curr = -1;
				}
			
		}
		System.out.println(ret);
	
	}

}
