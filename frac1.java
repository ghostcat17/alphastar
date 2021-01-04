/*
ID: justin72
LANG: JAVA
TASK: frac1
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class frac1 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("frac1.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("frac1.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		ArrayList<frac> arr = new ArrayList<frac>();
		
		
		for(int i = 1;i<=n;i++){
			for(int j = 0;j<=i;j++){
				
				
					insert(arr,new frac(j,i));
				
				
			}
		}
		for(int i = 0;i<arr.size();i++){
			pw.println(arr.get(i));
		}
		pw.flush();
		pw.close();

	}
	public static void insert(ArrayList<frac> arr, frac item){
		int c = binSearch(item,arr);
		if(c==-1){
			return;
		}
		arr.add(c, item);
		
	}
	public static int binSearch(frac key, ArrayList<frac> arr){
		int n = arr.size();
		int lowerbound = 0;
		int upperbound = n-1;
		int c = 0;
		while(true)
		{
			
			c = (lowerbound + upperbound)/2;
			if(arr.size()>0&&key.compareTo(arr.get(c))==0){
				return -1;
			}
			if(n==0)
				return 0;
			if(lowerbound>=upperbound)
			{
				if(arr.get(c).compareTo(key)==-1)
					return c+1;
				else
					return c;
			}
			if(arr.get(c).compareTo(key)==1 && arr.get(c-1).compareTo(key)==-1)
				return c;
			else if (arr.get(c).compareTo(key)==-1 && arr.get(c+1).compareTo(key)==1)
				return c+1;
			else
			{
				if(arr.get(c).compareTo(key)==1)
					upperbound = c-1;
				else
					lowerbound = c+1;
			}
		}
	}
	public static class frac implements Comparable<frac>{
		int numer;
		int denom;
		public frac(int numer, int denom){
			this.numer = numer;
			this.denom = denom;
		}

		public int compareTo(frac o) {
			
			if(((double)numer)/denom>((double)o.numer)/o.denom){
				return 1;
			}
			if(((double)numer)/denom==((double)o.numer)/o.denom){
				return 0;
			}
			else return -1;

		}
		public String toString(){
			return numer+"/"+denom;
		}
	}

}
