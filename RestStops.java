package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RestStops {
	
	public static class stop implements Comparable<stop>{
		private int index;
		private int tastiness;
		public stop(int index, int tastiness){
			this.index = index;
			this.tastiness = tastiness;
		}
		public int getIndex(){
			return index;
		}
		public int getTastiness(){
			return tastiness;
		}
		public int compareTo(stop o) {
			
			return o.tastiness-this.tastiness;
		}
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length  = Integer.valueOf(st.nextToken());
		int rest = Integer.valueOf(st.nextToken());
		long fj = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		
		int temp;
		int temp2;
		int lastEat = 0;
		long ret = 0;
		
		stop[] stops = new stop[rest];
		
		for (int i=0; i<rest; i++) {
			st = new StringTokenizer(br.readLine());
			temp = Integer.parseInt(st.nextToken());
			temp2 = Integer.parseInt(st.nextToken());
			stops[i] = new stop(temp,temp2);
		}
		Arrays.sort(stops);
		for(int i = 0;i<rest;i++){
			if(lastEat>=stops[i].getIndex()){
				continue;
			}else{
				
				ret +=((lastEat-stops[i].getIndex())*(b-fj))*stops[i].getTastiness();
				lastEat = stops[i].getIndex();
			}
		}
	System.out.println(ret);
	}
	
}
