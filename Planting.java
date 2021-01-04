package alphaStar;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Planting {
	static Set<String> arrL = new HashSet<String>();
	
	static Set<Integer> arrL2 = new HashSet<Integer>();
	static v[] cannot;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("revegetate.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("revegetate.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		cannot = new v[m];
		
		for(int i = 0;i<m;i++){
			st = new StringTokenizer(br.readLine());
			cannot[i] = new v(Integer.valueOf(st.nextToken()),Integer.valueOf(st.nextToken()));
		}
		char[] arr = new char[n];
		for(int i = 0;i<n;i++){
			arr[i] = '1';
		}
		permutate(String.copyValueOf(arr),0);
		
		Iterator<String> it = arrL.iterator();
		for(int i = 0;i<arrL.size();i++){
			String arr2 = it.next();
			if(check(cannot, arr2))arrL2.add(Integer.valueOf(arr2));
		}
		pw.println(Collections.min(arrL2));
		pw.flush();
		pw.close();
	}
	public static boolean check(v[] cannot, String arr){
		
				
			for(int j = 0;j<cannot.length;j++){
				int a = cannot[j].getA();
				
				int b = cannot[j].getB();
				
				if(arr.charAt(a-1)==arr.charAt(b-1)){
					return false;
					
				}
			}
			
		
			return true;
	}
	public static String replace(String str, int index, char replace){     
	    if(str==null){
	        return str;
	    }else if(index<0 || index>=str.length()){
	        return str;
	    }
	    char[] chars = str.toCharArray();
	    chars[index] = replace;
	    return String.valueOf(chars);       
	}
	
	public static void permutate(String arr,int i){
		
		
		if(i>arr.length()){
			
			return;
		}
		arrL.add(arr);
			
				permutate(replace(arr,i,'1'), i+1);
				permutate(replace(arr,i,'2'),i+1);
				permutate(replace(arr,i,'3'),i+1);
				permutate(replace(arr,i,'4'),i+1);
			
			
		}
	public static class v{
		int a;
		int b;
		public v(int a, int b){
			this.a = a;
			this.b = b;
			
		}
		public void setA(int a){
			this.a = a;
			
		}
		public void setB(int b){
			this.b = b;
		}
		public int getA(){
			return a;
		}
		public int getB(){
			return b;
		}
	}
	}

