
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class BackAndForth {
	static Set<Integer> b1 = new HashSet<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("alphaStar/backforth.out")));
		StringTokenizer st;
		ArrayList<Integer> barn1 = new ArrayList<Integer>();
		ArrayList<Integer> barn2 = new ArrayList<Integer>();
		
		Set<Integer> b2 = new HashSet<Integer>();
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0;i<10;i++){
			barn1.add(Integer.valueOf(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine()," ");
		sim(barn1,barn2,0,0);
		pw.println(b1.size());
		pw.flush();
		pw.close();
	}
	public static void sim(ArrayList<Integer> a,ArrayList<Integer> b,int result,int count){
		if(count==4){
			b1.add(result);
			return;
		}
		for(int i = 0;i<a.size();i++){
			int temp = a.get(i);
			a.remove(a.get(i));
			b.add(temp);
			sim(a,b,result+temp,count+1);
		}
		for(int i = 0;i<b.size();i++){
			int temp = b.get(i);
			b.remove(b.get(i));
			a.add(temp);
			sim(a,b,result+temp,count+1);
		}
	}
	
}
