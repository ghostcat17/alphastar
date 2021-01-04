package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CowSolitaire {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int height = Integer.valueOf(br.readLine());
		StringTokenizer st;
		int width = height;
		int[][] cards = new int[height+2][width+2];
		for(int i = 1;i<height+1;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 1;j<height+1;j++){
				
					cards[i][j] = transform(st.nextToken());
				
				
			}
			
			
		}
	
		
		for(int i = height;i>=1;i--){
			for(int j = 1;j<=height;j++){
				
				cards[i][j]+=Math.max(cards[i][j-1], cards[i+1][j]);
			}
		}
		
		System.out.println(cards[1][height]);
		
		
	}
	public static int transform(String card){
		char c = card.charAt(0);
		if(c=='A'){
			return 1;
		}
		if(c=='2'){
			return 2;
		}
		if(c=='3'){
			return 3;
		}
		if(c=='4'){
			return 4;
		}
		if(c=='5'){
			return 5;
		}
		if(c=='6'){
			return 6;
		}
		if(c=='7'){
			return 7;
		}
		if(c=='8'){
			return 8;
		}
		if(c=='9'){
			return 9;
		}
		if(c=='T'){
			return 10;
		}
		if(c=='J'){
			return 11;
		}
		if(c=='Q'){
			return 12;
		}
		if(c=='K'){
			return 13;
		}
		return -1;
		
	}

}
