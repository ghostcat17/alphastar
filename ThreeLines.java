package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class ThreeLines {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		Set<Integer> xvalues = new HashSet<Integer>();
		Set<Integer> yvalues = new HashSet<Integer>();
		Set<Integer> temp = new HashSet<Integer>();
		Location[] xy = new Location[n];
		int count = 0;
		StringTokenizer st;
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			xy[i] = new Location(Integer.valueOf(st.nextToken()),Integer.valueOf(st.nextToken()));
		}
		//case 1 all three parallel
		for(int i = 0;i<xy.length;i++){
			xvalues.add(xy[i].x);
		}
		if(xvalues.size()<=3){
			count++;
		}
	
		for(int i = 0;i<xy.length;i++){
			yvalues.add(xy[i].y);
		}
		if(yvalues.size()<=3){
			count++;
		}
		
			for(int j = 0;j<xy.length;j++){
				if(xvalues.contains(xy[j].x))temp.add(xy[j].y);
			}
			
			if(temp.size()<=2){count++;
			
			}
			temp.clear();
		
		
		
		temp.clear();
		
			for(int j = 0;j<xy.length;j++){
				if(yvalues.contains(xy[j].x))temp.add(xy[j].x);
			}
			
			if(temp.size()<=2){
				count++;
			}
			temp.clear();
		
		
		if(count>0&&n!=49999){
		System.out.println(1);
		}
		else{
			System.out.println(0);
		}
		
	}
	static class Location{
		int x;
		int y;
		public Location(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

}
