

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lineup {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lineup.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("lineup.out")));
//	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
//		String[] arr = {"Beatrice","Belinda","Bella","Bessie","Betsy","Blue","Buttercup","Sue"};
//		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
//		
//		int n = Integer.valueOf(br.readLine());
//		for(int i = 0;i<n;i++){
//			
//		}
//		String[] func = new String[n];
//		ArrayList<Point> points= new ArrayList<Point>();
//		
//		for(int i = 0;i<n;i++){
//			func[i] = br.readLine();
//		}
//		points = parse(arr, func);
//		
//		while(points.size()>0){
//			int min = 10;
//			Point current = points.get(0);
//			for(int i = 1;i<points.size();i++){
//				
//				if(!current.has(points.get(i).x)){
//					if(points.get(i).x<min){
//						min = points.get(i).x;
//						
//					}
//				}
//				if(!current.has(points.get(i).y)){
//					if(points.get(i).y<min){
//						min = points.get(i).y;
//						
//					}
//				}
//			}
//			for(int i = 0;i<points.size();i++){
//				if(points.get(i).x==min){
//					list.get(min).add(points.get(i).y);
//					int curr = points.get(i).y;
//					for(int j = 0;j<points.size();j++){
//						if(points.get(j).has(curr)){
//							list.get(min).add(points.get(j).add(curr));
//							
//							j = 0;
//						}
//					}
//				}
//			}
//		}
		
		pw.flush();
		pw.close();
		
	}
public static boolean check(ArrayList<Point> arr, ){
	
}

private static void permute(int[] str, int l, int r) 
{ 
	ArrayList<Point> points= new ArrayList<Point>() ;
    if (l == r) 
        for(int i = 0;i<points.size();i++){
        	for(int j = 0;j<str.length;j++){
        		if(str[j]==points.get(i).x){
        			if(j>0){
        				if(str[j-1]!=points.get(i).y)break;
        			}
        			
        			if(j<str.length-1){
        				if(str[j+1]!=points.get(i).y)break;
        			}
        			
        			
        		}
        		
        	}
        	
        }
    
    else { 
        for (int i = l; i <= r; i++) { 
            str = swap(str, l, i); 
            permute(str, l + 1, r); 
            str = swap(str, l, i); 
        } 
    } 
}
public static int[] swap(int[] a, int i, int j) 
{ 
    int temp; 
    
    temp = a[i]; 
    a[i] = a[j]; 
    a[j] = temp; 
    return a; 
} 

	public static ArrayList<Point> parse(String[] names, String[] func){
		ArrayList<Point> arr= new ArrayList<Point>();
		for(int i = 0;i<func.length;i++){
			String first = func[i].substring(0, func[i].indexOf(" "));
			String last = func[i].substring(func[i].lastIndexOf (' ')+1, func[i].length());
			int one = 0;
			int two = 0;
			System.out.println(first);
			System.out.println(last);
			for(int j = 0;j<names.length;j++){
				if(names[j].equals(first))one = j;
				if(names[j].equals(last))two = j;
				
			}
			System.out.println(one);
			System.out.println(two);
			arr.add(new Point(one,two));
			
		}
		return arr;
		
	}
	public static class Point implements Comparable<Point>{
		int x, y;
		
		public Point(int x, int y){
			if(y<x){
				this.x= y;
				this.y = x;
				
			}
			else{
				this.x = x;
				this.y = y;
			}
		}
		public boolean has(int a){
			return x==a||y==a;
		
		}
		public int add(int a){
			if(x==a){
				return y;
			}
			return x;
		}
		@Override
		public int compareTo(Point o) {
			if(this.x<o.x){
				return -1;
			}
			if(this.x==o.x){
				if(this.y<o.y){
					return -1;
				}	
				if(this.y>o.x){
					return 1;
				}
				if(this.y==o.y){
					return 0;
				}
			}
			
			return 1;
		}
	}
}
