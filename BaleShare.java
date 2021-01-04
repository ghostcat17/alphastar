package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaleShare {
	private static int currentMin = 1000000;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numBales = Integer.valueOf(br.readLine());
		int[] bales = new int[numBales];
		for (int i = 0; i < numBales; i++) {
			bales[i] = Integer.valueOf(br.readLine());
		}
		int barn1 = 0;
		int barn2 = 0;
		int barn3 = 0;
		int index = 1;
		recurse(barn1 + bales[0], barn2, barn3, index, numBales, bales);
		System.out.println(currentMin);
	}
	
	public static void recurse(int barn1, int barn2, int barn3, int index, int numBales, int[] bales) {
		if (barn1 > currentMin || barn2 > currentMin || barn3 > currentMin) return;
		if (index == numBales) {
			int testMax = Math.max(Math.max(barn1, barn2), barn3);
			currentMin = Math.min(currentMin, testMax);
		} else {
			recurse(barn1 + bales[index], barn2, barn3, index + 1, numBales, bales);
			recurse(barn1, barn2 + bales[index], barn3, index + 1, numBales, bales);
			recurse(barn1, barn2, barn3 + bales[index], index + 1, numBales, bales);
		}
		
	}
	
}
