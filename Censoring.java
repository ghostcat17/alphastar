package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Censoring {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		
		
		Stack<Character> ret = new Stack<Character>();
		String r1 = "";
		String temp = "";
		for(int i = 0; i<s.length();i++){
			temp="";
			ret.push(s.charAt(i));
			
			if(ret.size()>t.length()){
				for(int j = 0;j<t.length();j++){
					temp= ret.pop()+temp;
					
				}
				
				if(temp.hashCode()==t.hashCode()){
					continue;
				}
				else{
					for(int j = 0;j<temp.length();j++){
						ret.push(temp.charAt(j));
						
						
					}
				}
			}
		}
	

		
		
	}

	}


