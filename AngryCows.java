package alphaStar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue; 

public class AngryCows {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("angry.in")));
				//PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("angry.out")));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
				int n = Integer.valueOf(br.readLine());
				int[] arr = new int[n];
				for(int i =0;i<arr.length;i++){
					arr[i] = Integer.valueOf(br.readLine());
				}
				
				Queue<Integer> q = new LinkedList<Integer>();
				Arrays.sort(arr);
				int max = 0;
				for(int i =0;i<arr.length;i++){
					System.out.println();
					System.out.println();
					boolean[] visited = new boolean[n];
					int count = 1;
					
					q.add(i);
					visited[i] = true;
					while(!q.isEmpty()){
						int current = q.remove();
						System.out.println();
						System.out.println(arr[current]);
						System.out.println(count);
						System.out.println(Arrays.toString(arr));
						ArrayList<Integer> poss = distance(arr, current, count);
						System.out.println(poss);
						for(int j = 0;j<poss.size();j++){
							
							
							if(!visited[j]){
								System.out.println(poss.get(j));
								visited[j] = true;
								q.add(poss.get(j));
								
								
							}
						}
						count++;
						
						
					}	
					int temp = count(visited);
					System.out.println(Arrays.toString(visited));
					if(temp>max){
						max = temp;
					}
				
				}
				
				pw.println(max+1);
				pw.flush();
				pw.close();
				

	}
	public static int count(boolean[] arr){
		int ret = 0;
		for(boolean a:arr){
			if(a)ret++;
		}
		return ret;
	}
	public static ArrayList<Integer> distance(int[] arr, int i, int count){
		int min = arr[i]-count;
		int max = arr[i]+count;
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int j = 0;j<arr.length;j++){
			if(arr[j]>=min&&arr[j]<=max&&j!=i){
				ret.add(j);
			}
		}
		return ret;
	}

}
