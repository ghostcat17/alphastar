package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DontBeLast {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(br.readLine());
		
		
		
		
		
	}
	public static class Pair implements Comparable<Pair>{
		String name;
		int milk;
		public Pair(String name, int milk){
			this.name = name;
			this.milk = milk;
		}
	

		@Override
		public int compareTo(Pair o) {
			return this.milk-o.milk;
		}}
}
