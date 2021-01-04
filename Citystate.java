package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Citystate {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cityStates; 
		String[] statesCity;
		String line = br.readLine();
		StringTokenizer st;
		int x = Integer.valueOf(line);
		cityStates = new String[x];
		statesCity = new String[x];
		int sum = 0;
		
		for(int i = 0;i<x;i++){
		line = br.readLine();
		st = new StringTokenizer(line, " ");
		String value1;
		String value2;
		value1 = st.nextToken().substring(0,2);
		value2 = st.nextToken();
		
		cityStates[i] = value1+value2;
		statesCity[i] = value2+value1;
		
		}
		
		for(int i = 0;i<x;i++){
			for(int j = i+1; j<x;j++){
				if(cityStates[i].equals(statesCity[j])){
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
	
	
}
	

