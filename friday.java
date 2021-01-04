
/*
ID: justin72
LANG: JAVA
TASK: friday
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class friday {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("friday.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("friday.out")));
		
		int n = Integer.valueOf(br.readLine());
		int[] year = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
		int[] days = new int[7];
		int current = 0;
		for(int i = 1900;i<1900+n;i++){
			for(int j = 0;j<12;j++){
				int day = (12+current)%7;
				
				days[day]++;
				if(i%100==0){
					if(i%400==0){
					current+=leapYear[j];
					}
					else{
						current+=year[j];
					}
				}
				else if(i%4==0)current+=leapYear[j];
				else{
					current+=year[j];
				}
				
			}
		}
		
		
		  pw.print(days[5]);
	        pw.print(' ');
	        pw.print(days[6]);
	        pw.print(' ');
	        pw.print(days[0]);
	        pw.print(' ');
	        pw.print(days[1]);
	        pw.print(' ');
	        pw.print(days[2]);
	        pw.print(' ');
	        pw.print(days[3]);
	        pw.print(' ');
	        pw.println(days[4]);
	        
	        pw.flush();
	       pw.close();
	        br.close();

	}
	

}
