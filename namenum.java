/*
ID: justin72
LANG: JAVA
TASK: namenum
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class namenum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("namenum.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("namenum.out")));
		String num = br.readLine();
		String line;
		List<String> dict = readDict();
		int count = 0;
		for(String a: dict){
			if(convert(a).equals(num)){
				count++;
				pw.println(a);
			}
		}
		if(count==0){
			pw.println("NONE");
		}
		
		pw.flush();
		pw.close();
		br.close();
	}
	private static String convert(String line){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<line.length();i++){
			sb.append(change(line.charAt(i)));
		}
		return sb.toString();
	}
	private static int change(char line) {
		
		
		
			if(line=='A'||line=='B'||line=='C')return 2;
			if(line=='D'||line=='E'||line=='F')return 3;
			if(line=='G'||line=='H'||line=='I')return 4;
			if(line=='J'||line=='K'||line=='L')return 5;
			if(line=='M'||line=='N'||line=='O')return 6;
			if(line=='P'||line=='R'||line=='S')return 7;
			if(line=='T'||line=='U'||line=='V')return 8;
			if(line=='W'||line=='X'||line=='Y')return 9;	
		
		return 0;
	}
	private static List<String> readDict() throws IOException{
		List<String> ret = new ArrayList<String>();
		BufferedReader in = new BufferedReader(new FileReader("dict.txt"));
		String tmp;
		while( (tmp = in.readLine()) != null)
			ret.add(tmp);
		return ret;
	}

}
