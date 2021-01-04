
/*
ID: justin72
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;
class ride {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("ride.in")));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("ride.out")));
		
		String comet = br.readLine();
		String group = br.readLine();
		Long cometNum = 1L;
		Long groupNum = 1L;
		for(int i = 0;i<comet.length();i++){
			
			cometNum *=comet.charAt(i)-'A'+1;
			
		}
		
		for(int i = 0;i<group.length();i++){
			groupNum *=group.charAt(i)-'A'+1;
		}
		
		if(cometNum%47==groupNum%47){
			pw.println("GO");
			
		}
		else{
			pw.println("STAY");
			
			
		}
		pw.flush();
		pw.close();
		br.close();
		
	}
	

}
