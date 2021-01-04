package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MilkingCows2 {
	private static int[] seconds;
	private static int[] starts;
	private static int[] ends;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		seconds = new int[Integer.valueOf(line)*2];
		starts = new int[Integer.valueOf(line)];
		ends = new int[Integer.valueOf(line)];
		int count = 0;
		for(int i = 0;i<seconds.length;i++){
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			starts[i] = Integer.valueOf(st.nextToken());
			ends[i] = Integer.valueOf(st.nextToken());
		}
		quickSort(0,seconds.length-1);
		for(int i = 0;i<seconds.length;i++){
			
		}
		
		
	}
	private static void quickSort( int low, int high){
		if(low>=high)return;
		
		int pivot = seconds[(low+high)/2];//This looks good. But, that's all
		
		
		
		int i = low,j=high,temp;
		while(i<=j){
			while(seconds[i]<pivot)i++;
			while(seconds[j]>pivot)j--;
			if(i<=j){
				temp = seconds[i];
				seconds[i] = seconds[j];
				seconds[j] = temp;
				i++;
				j--;

			}
		}
		quickSort( low, j);
		quickSort(i, high);
		
	}
}
