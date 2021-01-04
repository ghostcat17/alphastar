package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PaintJob {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int p = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		LinkedList<Integer> q = new LinkedList<Integer>();
		int[] mix = new int[n];
		for(int i = 0;i<mix.length;i++){
			mix[i] = Integer.valueOf(st.nextToken());
			
		}
		
		int[] dist = new int[10000];
		for(int i = 0;i<dist.length;i++){
			dist[i] = -1;
		}
	
		
		dist[a] = 0;
		q.add(a);
		int current = a;
		int newColor = 0;
		while(!q.isEmpty()){
			current = q.removeFirst();
			
			
			for(int i = 0;i<mix.length;i++){
			
			 newColor = (current*mix[i])%p;
			if(newColor<=b&&dist[newColor]==-1){
				
				dist[newColor] = dist[current]+1;
				System.out.println(dist[current]);
				System.out.println(current);
				System.out.println(dist[newColor]);
				System.out.println(newColor);
				System.out.println();
				q.add(newColor);
			}
			
			
		}
		}
		
		System.out.println(dist[b]);

	}
}