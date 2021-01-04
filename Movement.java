package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Movement {
	private static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("herding.in")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("herding.out")));
		int b, e, m;
		b = Integer.valueOf(st.nextToken());
		e = Integer.valueOf(st.nextToken());
		m = Integer.valueOf(st.nextToken());
		pw.println(min(b,e,m));
		pw.println(max(b,e,m));
		pw.flush();
		pw.close();
		br.close();

	}
	public static int min(int b, int e, int m){
		if(m-b==2)return 0;
		if(e-b==2||m-e==2)return 1;
		else return 2;
	}
	public static int max(int b, int e, int m){
		int count = 0;
		
		if(e-b>m-e){
		while(m-b!=2){
			m = e;
			e = b+1;
			count++;
			if(m-b!=2){
				b = e;
				e = m-1;
				count++;
			}
			
		}
				
		}
		else{
			while(m-b!=2){
				
					b = e;
					e = m-1;
					count++;
				
			if(m-b!=2){
				m = e;
				e = b+1;
				count++;
			}
			}	
		
		}
		return count;
		
	}
	

}
