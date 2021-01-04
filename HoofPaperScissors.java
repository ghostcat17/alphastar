package alphaStar;
import java.util.*;
import java.io.*;

public class HoofPaperScissors {

	public static long hexToDec(String s)
    {
		 String digits = "0123456789ABCDEF";
         s = s.toUpperCase();
         long decimal = 0;
         for (int i = 0; i < s.length(); i++) {
             int temp = digits.indexOf(s.charAt(i));
             decimal = 16*decimal + temp;
         }
         return decimal;
    }
	public static long decToOct(long s){
		 long counter=0;
		   long result = 0;
		   while(s !=0) {
		        long temp = (long) ((s%8) * Math.pow(10, counter));
		        counter++;
		        result += temp;
		        s = s/8;
		    }
		    return result;
	}
    public static void main(String args[]) throws IOException
    {
    	BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		
        
        long decimal = hexToDec(br.readLine());
        
        System.out.println(decToOct(decimal));

    }


}
