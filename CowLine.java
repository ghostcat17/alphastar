package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CowLine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		String[] nums = new String[num];
		for(int i  = 0;i<num;i++){
			nums[i] = br.readLine();
		}
		Object[] a;
		String aod;
		String lor;
		String degree;
		int count = 0;
		int sum = 0;
		Deque<Integer> ll = new ArrayDeque<Integer>();
		
		for(int i = 0;i<num;i++){
			StringTokenizer st = new StringTokenizer(nums[i], " ");
			aod = st.nextToken();
			lor = st.nextToken();
			
			
			if(aod.equals("A")){	
			
				if(lor.equals("L")){
					sum++;
					count++;
					ll.addFirst(count);
					
				}
				if(lor.equals("R")){
					sum++;
					count++;
					ll.addLast(count);
				}
			}
			if(aod.equals("D")){
				if(lor.equals("L")){
					degree = st.nextToken();
					
					for(int j = 0;j<Integer.valueOf(degree);j++){
						sum--;	
						ll.removeFirst();
						
					}
				}
				if(lor.equals("R")){
					degree = st.nextToken();
					for(int j = 0;j<Integer.valueOf(degree);j++){
						sum--;
						ll.removeLast();
						
					}
				
			}
		}

	}
		
			a = ll.toArray();
			for(int i = 0;i<a.length;i++){
				System.out.println(a[i]);
			}
		
		
}
}
