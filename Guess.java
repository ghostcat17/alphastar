package alphaStar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Guess {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("guess.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("guess.out")));
		 int[] arr = new int[Integer.valueOf(br.readLine())];
		 for(int i = 0;i<arr.length;i++){
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 st.nextToken();
			 arr[i] = Integer.valueOf(st.nextToken());
		 }
		 int i, first, second; 
	       
	      
	        first = second = Integer.MIN_VALUE; 
	        for (i = 0; i <arr.length ; i++) 
	        { 
	            /* If current element is smaller than  
	            first then update both first and second */
	            if (arr[i] > first) 
	            { 
	                second = first; 
	                first = arr[i]; 
	            } 
	       
	            /* If arr[i] is in between first and  
	               second then update second  */
	            else if (arr[i] > second && arr[i] != first) 
	                second = arr[i]; 
	        } 
	          
	     pw.println(second+1);
	     pw.flush();
	     pw.close();
	     br.close();

	}

}
