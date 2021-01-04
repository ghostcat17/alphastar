package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CowElection {

	public static void main(String[] args) throws IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		Integer[] firstRound = new Integer[n];
		Integer[] secondRound = new Integer[k];
		HashMap<Integer,Integer> cows = new HashMap<Integer,Integer>();
		String[] cowsr = new String[n];
				
		String line;
		
		for(int i = 0;i<n;i++){
			
			line = br.readLine();
			st = new StringTokenizer(line, " ");
			String first = st.nextToken();
			cows.put(Integer.valueOf(first), Integer.valueOf(st.nextToken()));
			cowsr[i] = line;
			firstRound[i] = Integer.valueOf(first);
			
		}
		Arrays.sort(firstRound,Collections.reverseOrder());
		for(int i = 0;i<k;i++){
			secondRound[i] = cows.get(firstRound[i]);
		}
		Arrays.sort(secondRound,Collections.reverseOrder());
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(cowsr[i]," ");
			st.nextToken();
			String ret = st.nextToken();
		
			
			if(secondRound[0].equals(Integer.valueOf(ret)) ){
				
				System.out.println(i+1);
			}
		}

	}
	
}
