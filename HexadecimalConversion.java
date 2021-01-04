package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HexadecimalConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String digits = "0123456789ABCDEF";
		int i=1, j;
		Long octnum[] = new Long[1000];
        line = line.toUpperCase();
         Long val = 0L;
         for (int x = 0; x< line.length(); x++)
         {
             char c = line.charAt(x);
             int d = digits.indexOf(c);
             val = 16*val + d;
         }
         while( val!= 0)
         {
             octnum[i++] = val%8;
            val = val/8;
         }
 		
        
         for(j=i-1; j>0; j--)
         {
             System.out.print(octnum[j]);
         }
     }
		
		
		
		
		
		
	}
	

