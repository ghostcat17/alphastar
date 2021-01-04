package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


public class WordMorph {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String s = br.readLine();
		String line;
		
		Map<String,Integer> all = new HashMap<String,Integer>();
		while((line = br.readLine())!=null){
			if(line.length()==x.length()){
			all.put(line,-1);
			}
		}
		LinkedList<String> q = new LinkedList<String>();
		q.add(x);
		while(!q.isEmpty()){
			
			String current = q.removeFirst();
			for(int i = 0;i<x.length();i++){
				for(int j = 0;j<26;j++){
					 char[] a = Character.toChars(j+97);
					 String temp = current.substring(0,i)+'x'+current.substring(i+1);
					 if(all.containsKey(temp)&&all.get(temp)==-1){
						 q.add(temp);
						 all.put(temp, all.get(current)+1);
					 }
					 
					 
				}
			}
			
			
		}
		System.out.println(all.get(s));
		
	}
	

}
