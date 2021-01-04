package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNASequencing {
public static void main(String[] args) throws IOException{
	BufferedReader br = null;
	String line;
	
	int x = 0, y = 0;
	int length = 0;
	
		
	br = new BufferedReader(new InputStreamReader(System.in));
		

	line = br.readLine();
	StringTokenizer st = new StringTokenizer(line, " ");
	x = Integer.valueOf(st.nextToken());
	y = Integer.valueOf(st.nextToken());
	
	int[][] output = new int[x][y];
	
	String[] bullDNA = new String[x];
	String[] cowDNA = new String[y];

	String[] animalDNA = new String[x+y];

	for(int i = 0; i<animalDNA.length;i++){
		
		line = br.readLine();
		
		length = line.length();
		animalDNA[i] = line;
		
		if(i<(x)) {bullDNA[i] = line;}
		else { 
			
			cowDNA[i-(x)] = line;}
	}
	
	int sum = 0;
	
	//parents
	for(int i = 0;i<bullDNA.length;i++){
		for(int j = 0;j<cowDNA.length;j++){
			
			//child
			for(int k = 0;k<animalDNA.length;k++){
			if(animalDNA[k] == bullDNA[i]||animalDNA[k] == cowDNA[j])continue;
			sum=0;
			for(int l = 0;l<length;l++){
				if(bullDNA[i].charAt(l)==animalDNA[k].charAt(l)||cowDNA[j].charAt(l)==animalDNA[k].charAt(l)){
					sum++;
				}
			}
			if(sum==length)output[i][j]++;
			
		}
	}
	
}

	for(int i = 0;i<output.length;i++){
		for(int j = 0;j<output[i].length;j++){
			System.out.print(output[i][j]+ " ");
	}
		System.out.println();
		
}
}
	

}