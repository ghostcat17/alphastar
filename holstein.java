
/*
ID: justin72
LANG: JAVA
TASK: holstein
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.xml.soap.SOAPPart;

public class holstein {
	private static ArrayList<ArrayList<Integer>> minSeq = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("holstein.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("holstein.out")));
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[x];
		for(int i = 0;i<x;i++){
			arr[i] = Integer.valueOf(st.nextToken());
		}
		int y = Integer.valueOf(br.readLine());
		int[][] vitamins = new int[y][x];
		
		for(int i = 0 ;i<y;i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<x;j++){
				vitamins[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		int[] all = new int[y];
		for(int i = 0;i<y;i++){
			all[i] = i+1;
		}
		
		ArrayList<Integer> minArr = new ArrayList<Integer>();
		int minSize = Integer.MAX_VALUE;
		ArrayList<Integer> curr = new ArrayList<Integer>();
		
		   
        /*set_size of power set of a set 
        with set_size n is (2**n -1)*/
        long pow_set_size =  
            (long)Math.pow(2, y); 
        int counter, j; 
      
        /*Run from counter 000..0 to 
        111..1*/
        for(counter = 0; counter <  
                pow_set_size; counter++) 
        { 
            for(j = 0; j < y; j++) 
            { 
                /* Check if jth bit in the  
                counter is set If set then  
                print jth element from set */
                if((counter & (1 << j)) > 0) 
                   curr.add(all[j]); 
            }
            
            if(sum(curr, arr, vitamins)){
				
				if(minSize>curr.size()){
					minSize = curr.size();
					minArr = (ArrayList<Integer>) curr.clone();
					
				}
				else if(minSize == curr.size()){
					if(sum(minArr)>sum(curr)){
						minSize = curr.size();
						minArr = (ArrayList<Integer>) curr.clone();
					}
				}
			}
            curr.clear();
              
        } 
		
		
		
	
		
		
		
			
		
		StringBuilder sb = new StringBuilder();
		sb.append(minSize+" ");
		for(int i = 0;i<minArr.size();i++){
			sb.append(minArr.get(i)+" ");
		}
		pw.println(sb.toString().trim());
		pw.flush();
		pw.close();
		br.close();
		
	}
	public static int sum(ArrayList<Integer> array){
		int sum = 0;
		for(int i = 0;i<array.size();i++){
			sum+=array.get(i);
		}
		return sum;
	}
	   
   
	public static boolean sum(ArrayList<Integer> arr, int[] vitamins, int[][] feed){
		int[] temp = new int[vitamins.length];
		for(int i = 0;i<arr.size();i++){
			int[] curr = feed[arr.get(i)-1];
			for(int j = 0;j<curr.length;j++){
				temp[j]+=curr[j];
			}
		}
		for(int i = 0;i<temp.length;i++){
			if(temp[i]<vitamins[i]){
				return false;
			}
			
		}
		return true;
	}
}
