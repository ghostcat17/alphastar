package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LockCombos {
	static int n;
	static int[] fj = new int[3];
	static int[] master = new int[3];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		
		int[] fj = new int[3];
		int[] master = new int[3];
		for(int i = 0;i<3;i++){
			fj[i] = Integer.valueOf(st.nextToken());
			master[i] = Integer.valueOf(st1.nextToken());
		}
		
		int sum = 0;
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n;j++){
				for(int k = 1;k<=n;k++){
					if((difference(fj[0],i)&&difference(fj[1],j)&&difference(fj[2],k))||((difference(master[0],i)&&difference(master[1],j)&&difference(master[2],k)))){
					sum++;
					}
					
					
				}
			}
		}
		System.out.println(sum);
		
	}
	public static boolean difference(int a, int b){
		return Math.abs(b-a)<=2||Math.abs((n-b+a))<=2||Math.abs(n-a+b)<=2;//a=9 b=1
		
	}

}
