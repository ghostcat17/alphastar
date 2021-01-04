

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CowEvolution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("evolution.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("evolution.out")));
		int n = Integer.valueOf(br.readLine());
		Set<Set<String>> set = new HashSet<Set<String>>();
		for(int i = 0;i<n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			Set<String> current = new HashSet<String>();
			for(int j = 0;j<m;j++){
				current.add(st.nextToken());
			}
			set.add(current);
		}

		if(set.size() == n){
		pw.println("yes");
		pw.flush();
		pw.close();
		br.close();
		}
		else{
		pw.println("no");
		pw.flush();
		pw.close();
		br.close();
		}
	}
	
	

}
