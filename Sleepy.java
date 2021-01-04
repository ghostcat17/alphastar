package alphaStar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sleepy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("sleepy.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sleepy.out")));
			ArrayList<Integer> input = new ArrayList<Integer>();
			int n = Integer.valueOf(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0;i<n;i++){
				input.add(i, Integer.valueOf(st.nextToken()));
			}
			pw.println(sort(input));
			
	}
	public static boolean find(ArrayList<Integer> arr){
	
		for(int i = 0;i<arr.size()-1;i++){
			if(arr.get(i)>arr.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public static int sort(ArrayList<Integer> values){
		int count = 0;
		while(!find(values)){
			
			int temp = values.remove(0);
			int i = 1;
			
			while(i<values.size()){
				if(temp>values.get(i-1)&&temp<values.get(i)){
					break;
				}
				else{
					i++;
				}
				
				
			}
			
			if(i==1){
				values.add(values.size(), temp);
				
				
			}else{
				
				values.add(i,temp);
				
			}
		count++;
		}
	return count;
	}

}
