package alphaStar;

import java.io.*;
import java.util.*;

public class MixMilk {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		long[] cap = new long[3];
		long[] cow = new long[3];
		StringTokenizer st;

		
		for(int i = 0;i<3;i++){
		st = new StringTokenizer(br.readLine()," ");
		cap[i] = Integer.valueOf(st.nextToken());
		cow[i] = Integer.valueOf(st.nextToken());
		}
		
		for(int i = 0;i<100;i++){
			st = new StringTokenizer(simulate(cap[i%3],cow[i%3],cap[(i+1)%3],cow[(i+1)%3])," ");
			cow[(i)%3] = Integer.valueOf(st.nextToken());
			cow[(i+1)%3] = Integer.valueOf(st.nextToken());
			
		}
		
	
		pw.println(cow[0]);
		pw.println(cow[1]);
		pw.println(cow[2]);
		br.close();
		pw.flush();
		pw.close();

	}
	public static String simulate(long capA, long cowA, long capB, long cowB){
		long temp;
		if(cowA>(capB-cowB)){
			
			temp = cowB;
			cowB = capB;
			cowA = cowA-(capB-temp);
		}
		else{
			
			cowB += cowA;
			cowA = 0;
		}
	return cowA +" "+ cowB;
	}


}
