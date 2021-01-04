package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class SudokuSolver {
	static boolean isSolved = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] board = new int[9][9];
		for(int i = 0; i<9;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0;j<9;j++){
				board[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		Stack<Location> temp = new Stack<Location>();
		
		temp.push(new Location(0,0));
		
		if (solve(0,0,board))    // solves in place
			for (int[] row : board)
			{
			    
			    System.out.println(Arrays.toString(row));
			}
		else 
		    System.out.println("NONE");
		
		
	}
	public static boolean legal(int[][] board, int x, int y, int val){
		int gx = x/3;
		int gy = y/3;
		
		for(int i = 0;i<board.length;i++){
			   if (val == board[x][i])
					return false;

			
		}
		for(int i = 0;i<board.length;i++){
			
			if (val == board[i][y])
				return false;
		}
		for(int i = gx*3;i<(gx+1)*3;i++){
			for(int j = gy*3;j<(gy+1)*3;j++){
				if (val == board[i][j])
				    return false;
			}
		}
		return true;
	}
	
	public static boolean solve(int i, int j, int[][] cells){
		if (i == 9) {
		    i = 0;
		    if (++j == 9) 
			return true; 
		}
		if (cells[i][j] != 0)  // skip filled cells
		    return solve(i+1,j,cells);
		
		for (int val = 1; val <= 9; ++val) {
		    if (legal(cells, i,j,val)) {  
			cells[i][j] = val;       
			if (solve(i+1,j,cells))  
			    return true;
		    }
		}
		cells[i][j] = 0; // reset on backtrack
		return false;
		
		
		
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
