

import java.io.*;
import java.util.StringTokenizer;

public class BlockedBillBoard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		
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
		st = new StringTokenizer(br.readLine());
		int x5 = Integer.parseInt(st.nextToken());
		int y5 = Integer.parseInt(st.nextToken());
		int x6 = Integer.parseInt(st.nextToken());
		int y6 = Integer.parseInt(st.nextToken());
		
		// the visible area is the sum of the visible area of the first billboard and the second billboard
		int combinedArea = area(x1, y1, x2, y2, x5, y5, x6, y6) + area(x3, y3, x4, y4, x5, y5, x6, y6);
		
		// print the answer
		pw.println(combinedArea);
		pw.close();
	}
	public static int area(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		int visible = calc(x1, y1, x2, y2);
		int leftX = Integer.max(x1, x3);
		int rightX = Integer.min(x2, x4);
		int leftY = Integer.max(y1, y3);
		int rightY = Integer.min(y2, y4);
		if(leftX<rightX&&leftY>rightY){
			visible-=calc(leftX, leftY, rightX, rightY);
		}
		return visible;
	}
	public static int calc(int x1, int y1, int x2, int y2){
		return (y2-y1)*(x2-x1);
	}

}
