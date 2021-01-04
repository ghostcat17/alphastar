package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BronzeDiagnostic3 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = null;
		String line;
		int m, k,n;
		try {
			InputStream is = new FileInputStream("alphaStar/cowsignal.in");
			br = new BufferedReader(new InputStreamReader(is));
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Try a different file");
		}
			
		line = br.readLine();
		m = line.charAt(0);
		k = line.charAt(2);
		n = line.charAt(4);
		OutputStream os = new FileOutputStream("alphaStar/cowsignal.out");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
		StringBuilder sb = new StringBuilder();
		
		while((line=br.readLine())!=null){
			for(int i = 0;i<line.length();i++){
				sb.append(line.charAt(i));
				sb.append(line.charAt(i));
			}
			
			pw.println(sb.toString());
			sb.delete(0, line.length()*2);
			
		}
		
		pw.flush();
		pw.close();
	
	
	}
	
	
	
	
}
