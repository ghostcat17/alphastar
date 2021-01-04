package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class TheaterSeating {
	static int width;
	static int height;
	static int counter = 0;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		width = Integer.valueOf(st.nextToken());
		height = Integer.valueOf(st.nextToken());
		int[] ret = new int[width*height];
		int startX = (width+1)/2, startY = height-1;
		int count = 0;
		
		for(int i = 0;i<width;i++){
			for(int j = 0;j<height;j++){
				ret[i+j] = count++;
			}
		}
		 
		
	
	}
	
	
}
