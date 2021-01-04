package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MothersMilk {
	static boolean[] searched;
	static int a,b,c;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.valueOf(st.nextToken());
		b = Integer.valueOf(st.nextToken());
		c = Integer.valueOf(st.nextToken());
		searched = new boolean[c+1];
		
	}
	public static void dfs(int x, int y, int z){
		if(x==0){
			searched[z] = true;
		}
		if(Integer.max(a-x, z)==a-x){
			x+=z;
			z = 0;
		}
		if(Integer.max(a-x, z)==z){
			x=a;
			z = z-a+x;
		}
		
	}
}