package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhyDidTheChickenCrossTheRoad {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		int[] lights = new int[Integer.valueOf(st.nextToken())];
		int interval = Integer.valueOf(st.nextToken());
		int[] temp = new int[lights.length];
		int[] broken = new int[Integer.valueOf(st.nextToken())];
		
		for(int i = 0;i<broken.length;i++){
			line = br.readLine();
			temp[Integer.valueOf(line)-1] = 1;
		}
		
	    for(int i = 0;i<lights.length;i++){
	    	System.out.println(lights[i]);
	    
	    }
	
		
		 int smallest = 100000;
		 int x = 0;
		    for(int i = 0; i < temp.length; i++)
		    {
		        x += temp[i];      
		        lights[i] = x;
		    }
		  
		    for(int i = 0;i<lights.length;i++){
		    	System.out.println(lights[i]);
		    }
		    for(int i = 0 ;i<lights.length-interval;i++){
		    	
		    		if(smallest>(lights[i+interval]-lights[i])){
		    			smallest = lights[i+interval]-lights[i];
		    		}
		    	}
		    
		    System.out.println(smallest);
		    
	}
	
	
}
