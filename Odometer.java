package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;

public class Odometer {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String s = st.nextToken();
		String e = st.nextToken();
		int start = Integer.valueOf(s);
		int end = Integer.valueOf(e);
		StringBuilder sb;
		Long num;
		int ret = 0;
		for (int x = s.length(); x <= e.length(); x++) { 		
			for (int index = 0; index < x; index++) { 	
				for (int unique = 0; unique <= 9; unique++) { 		
					for (int majority = 0; majority <= 9; majority++) {
						if (majority == unique || 							
								(unique == 0 && index == 0) ||			
								(index != 0 && majority == 0))			
							continue;
						sb = new StringBuilder();
						for(int i = 0;i<x;i++){
							sb.append(majority);
							
						}
						sb.setCharAt(index, Integer.toString(unique).charAt(0));
						num = Long.valueOf(sb.toString());
						if (num >= start && num <= end)
							ret++;
					}
					}
				}
			}
		
		System.out.println(ret);
	}
	
	
	
}
