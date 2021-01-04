package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CardStacking {

	public static void main(String[] args) throws IOException {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> q = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cows = Integer.valueOf(st.nextToken());
		int deck = Integer.valueOf(st.nextToken());
		int skip  = Integer.valueOf(st.nextToken());
		for(int i = 1;i<=deck;i++){
			q.add(i);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(!q.isEmpty()){
			for(int i = 0;i<q.size();i++){
				System.out.print(q.get(i));
				
			}
			System.out.println();
			for(int i = 0;i<cows;i++){
				q.remove();
			if(i==cows-1){
				list.add(q.remove());
			}
			if(!q.isEmpty()){
				for(int j = 0;j<skip;j++){
					q.add(q.remove());
				}
			}
			}
		
		}
		
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
