package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexagonalPastureNetwork {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.valueOf(br.readLine());
		int H = Integer.valueOf(br.readLine());
		int L = Integer.valueOf(br.readLine());
		int[] magic = new int[2*K-1];
		int change = K;
		int delta = 1;
		for(int i = 0;i<magic.length;i++){
			magic[i] = magic[i-1];
			magic[i] +=change;
			change+=delta;
			if(i==K*2+1){
				delta = -1;
			}
		}

	}
	public static int[] convertToCoord(int[] magic,int num){
		for(int x = magic.length;;x--){
			return new int[] {x,num-magic[x]-1};
		}
	}
	public static int convertToNum(int[] magic,int[] coord){
		return magic[coord[0]+coord[1]]+1;
		
	}

}
