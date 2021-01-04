package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;

public class TheWaterBowls {
	static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[20];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<arr.length;i++){
			String token = st.nextToken();
			System.out.println(token);
			if(token.equals("1")){
				
				arr[i] = true;
			}
			else{
				arr[i] = false;
			}
		}
	
		run(arr,0,ones(arr).get(0));
		System.out.println(set.iterator().next());

	}
	public static void flip(boolean[] arr, int pos){
		
		
		if(pos==0){
			arr[0] = !arr[0];
			arr[1] = !arr[1];
		}
		else if(pos==arr.length-1){
			arr[pos] = !arr[pos];
			arr[pos-1] = !arr[pos-1];
		}
		else{
			arr[pos] = !arr[pos];
			arr[pos+1] = !arr[pos+1];
			arr[pos-1] = !arr[pos-1];
		}
		
	}
	public static void run(boolean[] arr, int count, int pos){
		flip(arr, pos);
		LinkedList<Integer> ones = ones(arr);
		if(ones.size()==0){
			set.add(count);
			return;
		}
		if(ones.size()==1){
			return;
		}
		else{
			for(int i = 0;i<ones.size();i++){
				run(arr,count+1,ones.get(i));
			}
		}
	}
	public static LinkedList<Integer> ones(boolean[] arr){
		LinkedList<Integer> ret = new LinkedList<Integer>();
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == true)ret.add(i);
		}
		return ret;
	}
	
	

}
