package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EightQueensProblem {
	 	private static int n = 8;
	   
	    private static int num_solutions;
	    

	    public static void main(String[] args) throws NumberFormatException, IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	n = Integer.valueOf(br.readLine());
	        Map<Integer, Integer> placed = new HashMap<Integer,Integer>();
	        solveNQueens(placed, 0);
	        System.out.println(num_solutions);
	    }

	   
	        static void solveNQueens(Map<Integer, Integer> placed, int row) {
	        if (row == n) {
	            num_solutions++;
	            
	            return;
	        }
	        for (int col = 0; col < n; col++) {
	            if (isValid(row, col, placed)) {
	                placed.put(row, col);
	                solveNQueens(placed, row + 1);
	                placed.remove(row);
	            }
	        }
	    }

	   
	    private static boolean isValid(int row, int col, Map<Integer, Integer> placed) {
	       
	        for (Integer r : placed.keySet()) {
	           
	            Integer c = placed.get(r);
	            if (c == col) return false;
	           
	            if (isOnDiagonal(row, col, r, c)) {
	                return false;
	            }
	        }
	        return true;
	    }

	   
	    private static boolean isOnDiagonal(int row1, int col1, int row2, int col2) {
	        return Math.abs(row1 - row2) == Math.abs(col1 - col2);
	    }

	 
	  
	}
