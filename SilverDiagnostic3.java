package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SilverDiagnostic3 {
	public static void main(String[] args)throws IOException{
	
	BufferedReader br = null;
	String line;
	int same = 0;
	int different = 0;
	double total;
	int nOC = 0;
	
	
	try {
		InputStream is = new FileInputStream("alphaStar/assign.in");
		br = new BufferedReader(new InputStreamReader(is));
		
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Try a different file");
	}
	
	line = br.readLine();
	nOC = line.charAt(0)-'0';
	total = Math.pow(3, nOC);
	while((line = br.readLine())!=null){
		if(line.startsWith("S")){
			same++;
		}
		else{
			different++;
		}
	}
	if(same!=0&&different!=0){
		for(int i = 0;i<same;i++){
			total = total/3;
		}
	for(int i = 0;i<different;i++){
		total = total/3*2;
	}
	}
	else if(same==0){
		for(int i = 0;i<different;i++){
			total = total/3*2;
		}
		//total = total/3*(different*2);
		
	}
	else{
		for(int i = 0;i<same;i++){
			total = total/3;
		}
	}
	System.out.println(total);
		
	
	
	}
	public static boolean check(String[] requirements, String combination){
		
		return false;
	}
	}


