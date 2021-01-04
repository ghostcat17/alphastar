package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BovineBallet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.valueOf(br.readLine());
		String[] inputs = new String[x];
		for(int i = 0;i<x;i++){
			inputs[i] = br.readLine();
			
		}
		//FR: Front right foot 0 
		//FL: Front left foot 1
		//RR: Rear right foot 2
		//RL: Rear left foot 3
		
		int[] feet = new int[3];
		int maxX;
		int maxY;
		
		

	}
	

}
