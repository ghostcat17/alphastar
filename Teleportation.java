package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Teleportation {
	private static int min; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		Pair.x = Integer.valueOf(st.nextToken());
		Pair.y = Integer.valueOf(st.nextToken());
		

	}
	public static void bfs(int current, int b, int count){
		if(current<0||current>100){
			return;
		}
		if(current == b){
			if(count<min){
				min = count;
			}
				
		}
		else{
			if(Pair.changeAble(current)){
				bfs(Pair.change(current),b,count);
			}
			else{
				bfs(current+1,b,count+1);
				bfs(current-1,b,count+1);
			}
		}
	}
	
	public static class Pair{
		private static int x;
		private static int y;
		public static boolean changeAble(int current){
			return current ==x ||current==y;
		}
		public static int change(int current){
			if(current == x){
				return y;
			}
			else{
				return x;
			}
		}
	}

}
