

/*
ID: justin72
LANG: JAVA
TASK: combo
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class combo {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("combo.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("combo.out")));
	int n = Integer.valueOf(br.readLine());
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int[][] arr = new int[3][1];
	for(int i = 0;i<arr.length;i++){
		for(int j = 0;j<arr[i].length;j++){
			arr[i][j] = Integer.valueOf(st.nextToken());
		}
	}
	st = new StringTokenizer(br.readLine());
	int[][] master = new int[3][1];
	for(int i = 0;i<master.length;i++){
		for(int j = 0;j<master[i].length;j++){
			master[i][j] = Integer.valueOf(st.nextToken());
		}
	}
	int count = 0;
	for(int i = 1;i<=n;i++){
		for(int j = 1;j<=n;j++){
			for(int k = 1;k<=n;k++){
				if((ok(i, arr[0][0],n) && ok(j, arr[1][0],n) && ok(k, arr[2][0],n))
                        || (ok(i, master[0][0],n) && ok(j, master[1][0],n) && ok(k, master[2][0],n))){
					
					count++;
				}
			}
		}
	}
		
	pw.println(count);
	pw.flush();
	pw.close();
	br.close();
	}
	public static boolean ok(int a, int b, int n){
		if(Math.abs(a-b) <= 2 || Math.abs(a-b) >= n-2) return true;
	    return false;
	
}
}