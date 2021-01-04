package alphaStar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PebbleSwap {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("shell.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
			int[][] input = new int[Integer.valueOf(br.readLine())][3];
			
			for(int i = 0;i<input.length;i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0;j<input[i].length;j++){
					input[i][j] = Integer.valueOf(st.nextToken());
				}
				
			}
			int max = 0;
			int temp = 0;
			int[] start1 = {1, 0 ,0};
			int[] start2 = {0, 1, 0};
			int[] start3 = {0, 0, 1};
			
			for(int i = 0;i<input.length;i++){
				int guess = input[i][2];
				swap(start1, input[i][0],input[i][1]);
				if(guess-1 == find(start1))temp++;
				
			}
			if(temp>max){
				max = temp;
			}
			temp = 0;
			for(int i = 0;i<input.length;i++){
				int guess = input[i][2];
				swap(start2, input[i][0],input[i][1]);
				if(guess-1 == find(start2))temp++;
				
				
			}
			if(temp>max){
				max = temp;
			}
			temp = 0;
			for(int i = 0;i<input.length;i++){
				int guess = input[i][2];
				swap(start3, input[i][0],input[i][1]);
				if(guess-1 == find(start3))temp++;
				
				
			}
			if(temp>max){
				max = temp;
			}
			pw.println(max);
			pw.flush();
			pw.close();
			br.close();
	}
	public static void swap(int[] values, int i, int j){
		i--;
		j--;
		int temp = values[i];
		values[i] = values[j];
		values[j] = temp;
	}
	public static int find(int[] values){
		
		for(int i = 0;i<values.length;i++){
			if(values[i]==1)return i;
		}
		return 0;
	}

}
