package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Typo {

	public static void main(String[] args) throws IOException {
			
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int a = 0;
		int b = 0;
		int c = 0;
		int ret = 0;
		for (int i = 0; i < line.length(); i++)
		    {
		        if(line.charAt(i) == '(')
		        {
		            a++;
		            b++;
		        }
		        else
		        {
		            a--;
		            c++;
		        }
		        
		        if(a <= 1)
		            b = 0;
		        if(a == -1)
		        {
		            ret = c;
		            break;
		        }
		    }
		    
		    if(a > 0)
		        ret = b;

		    System.out.println(ret);
	}


}
