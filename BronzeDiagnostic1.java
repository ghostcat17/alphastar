package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BronzeDiagnostic1 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = null;
		String line;
		int x[] = new int[4], y[] = new int[4];
		int smallestX = 10, smallestY = 10, biggestX = 0, biggestY=0;
		int differenceX, differenceY;
		
		
		try {
			InputStream is = new FileInputStream("alphaStar/square.in");
			br = new BufferedReader(new InputStreamReader(is));
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Try a different file");
		}
		
		line = br.readLine();
	
		StringTokenizer st = new StringTokenizer(line," ");
		for(int i = 0;i<2;i++){
			
		x[i] = Integer.valueOf(st.nextToken());
		y[i] = Integer.valueOf(st.nextToken());

		}
		line = br.readLine();
		StringTokenizer st2 = new StringTokenizer(line," ");
		
		for(int i = 2;i<x.length;i++){
			
			x[i] = Integer.valueOf(st2.nextToken());
			y[i] = Integer.valueOf(st2.nextToken());

			}
		
		for(int i = 0;i<x.length;i++){
			if(x[i]<smallestX){
				smallestX = x[i];
			}
		
		}
		for(int i = 0;i<y.length;i++){
			if(y[i]<smallestY){
				smallestY = y[i];
			}
			
		}
		
		for(int i = 0;i<x.length;i++){
			if(x[i]>biggestX){
				biggestX = x[i];
			}
		
		}
		for(int i = 0;i<y.length;i++){
			if(y[i]>biggestY){
				biggestY = y[i];
			}
			
		}
		
		
		if(biggestX-smallestX>biggestY-smallestY){
			System.out.println((biggestX-smallestX)*(biggestX-smallestX));
			System.out.println("true");
		}
		else{
			System.out.println((biggestY-smallestY)*(biggestY-smallestY));
			
		}
		
	}

}
