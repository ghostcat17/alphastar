package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COW {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		String line = br.readLine();
		int w = 0, ow = 0, answer = 0;
		char curr;
		for(int i = n-1;i>=0;i--){
			curr = line.charAt(i);
			
			if(curr=='W'){
				
				w++;
			}
			if(curr=='O'){
				ow+=w;
			}
			if(curr=='C'){
				answer+=ow;
			}
			
		}
		System.out.println(answer);

	}

}
