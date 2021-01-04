package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountChange {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int num = Integer.valueOf(st.nextToken());
		int[] coins = new int[num];
		for(int i = 0;i<coins.length;i++){
			coins[i] = Integer.valueOf(br.readLine());
		}
		System.out.println(countChange(n,coins.length,coins));
	}
	public static int countChange(int n, int m, int[] coins){
		if(n<0)return 0;
		if(n==0)return 1;
		 if (m <=0 && n >= 1) {
	            return 0;
		 }
		else{
		return countChange(n,m-1,coins)+countChange(n-coins[m-1],m,coins);
		}
	}

}
