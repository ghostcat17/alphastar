package alphaStar;

import java.util.Arrays;

public class MineSweeper {

	public static void main(String[] args) {
		int[][] board = {
				{1,2,2},
				{1,2,2},
				{1,1,1},
				{0,0,0}				
		};
		
		boolean[][] mines = {
				{false, false, true},
				{false, true, false},
				{false, false, false},
				{false, false, false}
		};
		System.out.println(check(board, mines));

	}
	public static boolean[][] solve(int[][] board, boolean[][] mines, int i, int j){
		if(i==board.length){
			i = 0;
			if(++j==board[0].length){
				return mines;	
			}
		}
		
		if(check(board,mines)){
			System.out.println(true);
			mines[i][j] = true;
		}
		solve(board, mines, i+1, j);
		
		return mines;
	}
	public static boolean check(int[][] board, boolean[][] mines){
		int[][] arr = new int[board.length][board[0].length];
		int[] xdir = {1,-1,0};
		int[] ydir = {1,-1,0};
		for(int i = 0;i<board.length;i++){
			for(int j = 0;j<board[i].length;j++){
				for(int side:xdir){
					for(int up:ydir){
						int currentx = i+side;
						int currenty  = j+up;
			
						
						if(currentx>0&&currentx<board.length&&currenty>0&&currenty<board[i].length){
							
							if(mines[currentx][currenty]){
								System.out.println(side);
								System.out.println(up);
								arr[i][j]+=1;
								for (int[] row : arr)
								{
								 
								    System.out.println(Arrays.toString(row));
								}
								System.out.println();
								
							}
							for(int[] row:board){
								System.out.println(Arrays.toString(row));
							}
							System.out.println("aspoiefpaiwenfijaweiof");
							
							
							if(arr[i][j]>board[i][j]){
								
								return false;
							}
						}
						
							
						
					}
				}
			}
		}
		
	return true;
	}
	

}
