package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SquarePasture {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x1 = 0, x2 = 0,y1 = 0, y2 = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		x1 = Integer.valueOf(st.nextToken());
		y1 = Integer.valueOf(st.nextToken());
		x2 = Integer.valueOf(st.nextToken());
		y2 = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int x3 = 0, x4 = 0,y3 = 0, y4 = 0;
		
		x3 = Integer.valueOf(st.nextToken());
		y3 = Integer.valueOf(st.nextToken());
		x4 = Integer.valueOf(st.nextToken());
		y4 = Integer.valueOf(st.nextToken());
		int minX = Integer.min(Integer.min(Integer.min(x1, x2),x3),x4);
		int maxX = Integer.max(Integer.max(Integer.max(x1, x2),x3),x4);
		int minY = Integer.min(Integer.min(Integer.min(y1, y2),y3),y4);
		int maxY = Integer.max(Integer.max(Integer.max(y1, y2),y3),y4);
		int distX = maxX-minX;
		int distY = maxY-minY;
		System.out.println((int)Math.pow(Integer.max(distX, distY), 2));
		
	}

}
