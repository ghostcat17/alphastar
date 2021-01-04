package alphaStar;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class PalidromicPaths {
	private static int count = 0;
	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.valueOf(br.readLine());
		String[][] path = new String[n][n];
		for(int i = 0; i<n;i++){
			String line = br.readLine();
			for(int j = 0;j<n;j++){
			path[i][j] = String.valueOf(line.charAt(j));
			}
		}
		path(path, "", 0 , 0);
		all();

	}
	public static void path(String[][] arr, String current, int x, int y){
		if(y>=arr.length||x>=arr.length){
			set.add(current);
			return;
		}
		
		//down
		path(arr, current+arr[x][y],x,y+1);
		//right
		path(arr,current+arr[x][y],x+1,y);
		
	}
	public static void all(){
		int count = 0;
		Iterator<String> it = set.iterator();
		for(int i = 0;i<set.size();i++){
			if(check(it.next())){
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check(String s){
		int middle = (s.length()-1)/2;
		for(int i = 0;i<middle;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
			
				return false;
			}
		}
		return true;
	}
}
