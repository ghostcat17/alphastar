
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BlockedBillboard2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		
		// read in the locations of the first billboard
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		// read in the locations of the second billboard
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		int x4 = Integer.parseInt(st.nextToken());
		int y4 = Integer.parseInt(st.nextToken());
		
		// read in the locations of the truck
		System.out.println(Math.abs(calc(x1, y1, x2, y2, x3, y3, x4, y4)));

	}
	public static int calc(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		int leftX = Integer.min(x2, x3);
		int rightX = Integer.max(x1, x4);
		int leftY = Integer.max(y2, y3);
		int rightY = Integer.min(y1, y4);
		int area = 0;
		if(leftX<rightX&&leftY>rightY){
			area = area(leftX, leftY, rightX, rightY);
		}
		return area; 
	}
	public static int area(int x1, int y1, int x2, int y2){
		return (y2-y1)*(x2-x1);
	}

}
