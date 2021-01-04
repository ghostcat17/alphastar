package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class photo {

	public static void main(String[] args) throws IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cows = Integer.valueOf(st.nextToken());
		int ucows = Integer.valueOf(st.nextToken());
		int[] line = new int[cows];
		int count = 0;
		int temp = 0;
		Set<Integer> set = new HashSet<Integer>(); 
		for(int i = 0;i<line.length;i++){
			line[i] = ++temp;
		}
		for(int i = 1;i<=ucows;i++){
			
			System.out.println(temp);
			st = new StringTokenizer(br.readLine());
			line[Integer.valueOf(st.nextToken())] = -i;
			line[Integer.valueOf(st.nextToken())] = -i;
		}
		for(int i = 0;i<cows;i++){
			temp++;
			
			set.add(line[i]);
			if(set.size()!=temp){
				count++;
				set.clear();
			}
			
		}
		
		System.out.println(count);
	}

}
