

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

public class whereami {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("whereami.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("whereami.out")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		String a = br.readLine();
		System.out.println(a);
		int current = 0;
		for(int i = 1;i<=n;i++){
			if(combo(i,a)){
				current = i;
				break;
			}
			
		}
		pw.println(current);
		pw.flush();
		pw.close();
	}
	public static boolean combo(int n, String a){
		ArrayList<String> marked = new ArrayList<String>();
		
		for(int i = 0;i<=a.length()-n;i++){
			String current = a.substring(i, i+n);
			
			for(int j = 0;j<marked.size();j++){
				
				if(marked.get(j).equals(current)){
					
					return false;
				}
				
			}
			marked.add(current);
		}
		
		return true;
	}

}
