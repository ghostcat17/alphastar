package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BovineShuffle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		int[] pointer = new int[num];
		int[] count = new int[num];
		LinkedList<Integer> ll = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0;i<num;i++){
			pointer[i] = Integer.valueOf(st.nextToken());	
		}
		for(int i = 0;i<num;i++){
			count[pointer[i]-1]++; 
		}
		int ret = num;
		for(int i = 0;i<num;i++){
			
			if (count[i]==0){
				ll.add(i);
				ret--;
				
			}
			else{
				continue;
			}
		}
		int a;
		while(!ll.isEmpty()){
			a = ll.removeFirst();
			if(--count[pointer[a]-1] == 0) {
				ll.add(pointer[a]-1);
				ret--;
			}
		}
		
		

	System.out.println(ret);
	}


}
