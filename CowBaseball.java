package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CowBaseball {
	private static int[] pos;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int x = Integer.valueOf(line);
		pos = new int[x];
		int sum = 0;
		for(int i = 0;i<x;i++){
			line = br.readLine();
			pos[i] = Integer.valueOf(line);
		}
		quickSort(0,x-1);
		for(int i = 0;i<pos.length;i++){
			if(i == 0||i==1)continue;
			else{
				for(int j = 0;j<i;j++){
					for(int k = 0;k<j;k++){
						
						if(((pos[i]-pos[j])>=(pos[j]-pos[k]))&&((pos[i]-pos[j])<=(2 *(pos[j]-pos[k])))){
							
							sum++;
						}
					}
				}
			}
		}
System.out.println(sum);
	}
	private static void quickSort( int low, int high){
		if(low>=high)return;
		
		int pivot = pos[(low+high)/2];//This looks good. But, that's all
		
		
		
		int i = low,j=high,temp;
		while(i<=j){
			while(pos[i]<pivot)i++;
			while(pos[j]>pivot)j--;
			if(i<=j){
				temp = pos[i];
				pos[i] = pos[j];
				pos[j] = temp;
				i++;
				j--;

			}
		}
		quickSort( low, j);
		quickSort(i, high);
		
	}
}
