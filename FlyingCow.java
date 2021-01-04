package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class FlyingCow {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		LinkedList<Integer> q = new LinkedList<Integer>();
		int[] dist = new int[n+1];
		for(int i = 0;i<dist.length;i++){
			dist[i] = -1;
		}
		dist[1] = 0;
		q.add(1);
		int current = 0;
		while(!q.isEmpty()){
			current = q.removeFirst();
			if(current-1>=0&&dist[current-1]!=-1){
				dist[current-1] = dist[current]+1;
			
				q.add(current-1);
			}
			
			if(current+1<=dist.length-1&&dist[current+1]!=-1){
				dist[current+1] = dist[current]+1;
				q.add(current+1);
				
			}
			if(current*3<=dist.length-1&&dist[current*3]!=-1){
				dist[current*3] = dist[current]+1;
				q.add(current*3);
			}
			
		}
		System.out.println(dist[Integer.valueOf(n)]);

	}

}
