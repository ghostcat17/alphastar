package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MilkingCows {
	static String[] totalTimes;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] startTimes = new int[n];
		int[] endTimes = new int[n];
		totalTimes = new String[2*n];
		String[] sum = new String[2*n];
		String[] prefix = new String[2*n];
		for(int i = 0;i<2*n;i+=2){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			totalTimes[i] = st.nextToken() + "," + "s";
			totalTimes[i+1] = st.nextToken() + "," + "e";
		}
		quickSort(0,2*n-1);
		int count = 0;
		for(int i = 0;i<totalTimes.length;i++){
			System.out.println(soe(totalTimes[i]));
			if(soe(totalTimes[i]).equals("s")){
				
				count++;
				sum[i] = number(totalTimes[i])+","+count;
				prefix[i] = String.valueOf(count);
			}
			else{
				count--;
				sum[i] = number(totalTimes[i])+","+count;
				prefix[i] = String.valueOf(count);
			}
		}
		
		int largest = 0;
	for(int i = 1;i<zeros(prefix).size();i++){
		
		if(largest>(number(String.valueOf(zeros(prefix).get(i-1)))-number(String.valueOf(zeros(prefix).get(i))))){
			System.out.println(String.valueOf(zeros(prefix).get(i-1)));
			largest = number(String.valueOf(zeros(prefix).get(i-1)))-number(String.valueOf(zeros(prefix).get(i)));
		}
		
	}
		for(int i = 0;i<zeros(prefix).size();i++){
			System.out.println(zeros(prefix).get(i));
		}
		System.out.println(largest);
	}
	
	private static String soe(String s){
		return s.substring(s.indexOf(",")+1,s.length() );
	}
	private static ArrayList zeros(String[] arr){
		ArrayList ret = new ArrayList();
		ret.add(0);
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i].equals("0")){
				ret.add(i);
			}
		}
		return ret;
	}
	private static int number(String s){
		return Integer.valueOf(s.substring(0,s.indexOf(",")));
	}
	private static void quickSort( int low, int high){
		if(low>=high)return;
		
		int pivot = Integer.valueOf(totalTimes[(low+high)/2].substring(0, totalTimes[(low+high)/2].indexOf(",")));//This looks good. But, that's all
		
		
		
		int i = low,j=high;
				String temp;
		while(i<=j){
			while(Integer.valueOf(totalTimes[i].substring(0, totalTimes[i].indexOf(",")))<pivot)i++;
			while(Integer.valueOf(totalTimes[j].substring(0, totalTimes[j].indexOf(",")))>pivot)j--;
			if(i<=j){
				temp = totalTimes[i];
				totalTimes[i] = totalTimes[j];
				totalTimes[j] = temp;
				i++;
				j--;

			}
		}
		quickSort( low, j);
		quickSort(i, high);
		
	}

}
