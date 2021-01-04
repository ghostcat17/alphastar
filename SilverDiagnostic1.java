package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SilverDiagnostic1 {

	public static void main(String[] args) throws IOException{
		//add up total distance declare winner of each seg. 
		//create string
		//iterate through and determine changes
		
		BufferedReader br = null;
		int distance;
		String line;
		String sum1 = null;
		String sum2 = null;
		String results = null;
		int count = 0;
		String[] times;
		int n,m;
		int time,rate;
		String[] first ;
		String[] second ;	
		int total1 = 0, total2 = 0;
		
		
		try {
			InputStream is = new FileInputStream("alphaStar/cowrace.in");
			br = new BufferedReader(new InputStreamReader(is));
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Try a different file");
		}
		System.out.println((line = br.readLine())); 
		
		
		
		//n=line.char(0);
		n=line.charAt(0)-'0';
		
		
		
		m = line.charAt(2)- '0';
		
		
		
		
		times = new String[n+m+1];
		first = new String[n];
		second = new String[m]; 
		int index=0;
		while(index<n){
			System.out.println(index);
			first[index]=br.readLine();
			index++;
			
		}
		index=0;
		while(index<m){
			System.out.println(index);
			second[index] = br.readLine();
			index++;
		}
		for(int i = 0;i<first.length;i++){
			System.out.println(first[i]);
			StringTokenizer st = new StringTokenizer(first[i], " ");
			rate = Integer.valueOf(st.nextToken());
			time = Integer.valueOf(st.nextToken());
			
			for(int j = 0;j<time;j++){
				sum1+=rate;
			}
			
			
		}
		sum1 = sum1.substring(5, sum1.length());
		
		
		System.out.println(sum1);
		
		for(int i = 0;i<second.length;i++){
			System.out.println(second[i]);
			StringTokenizer st = new StringTokenizer(second[i], " ");
			rate = Integer.valueOf(st.nextToken());
			time = Integer.valueOf(st.nextToken());
			
			for(int j = 0;j<time;j++){
				sum2+=rate;
			}
			
			
		}
		sum2 = sum2.substring(5, sum2.length());
		
		
		System.out.println(sum2);
		int current = 0,previous = 0;//true is 1, false is 2
		
		for(int i = 0;i<sum2.length();i++){
			total1+=(sum1.charAt(i)-'0');
			total2+=(sum2.charAt(i)-'0');
			System.out.println(total1);
			System.out.println(total2);
			System.out.println();
			if(total1>total2){
				current=1;
			}
			else{
				current=2;
			}
			if(current!=previous){
				count++;
				previous = current;
			}
			
		}
		
		System.out.println(count-1);
	}
	
}
