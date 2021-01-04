package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Traffic {
	static int after;
	static int before;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		v[] sig =new v[n];
		
		StringTokenizer st;
		int count = 0;
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			sig[i] = new v(st.nextToken(),Integer.valueOf(st.nextToken()),Integer.valueOf(st.nextToken()));
			if(sig[i].getIO().equals("none")){
				
				count++;
				
			}
			
			if(count<1){
				before+=sig[i].getB();
			}
			
			
		}
		int[][] arr = new int[count][1];
		v[] none = new v[count];
		count = 0;
		for(int i = n-1;i>0;i--){
			
			if(sig[i].getIO().equals("none")){
				
				count++;
				
			}
			if(count<1){
				after+=sig[i].getB();
			}
			
			
		}

		
	
		count = 0;
		for(int i = 0;i<n;i++){
			if(sig[i].getIO()=="none"){
				
				none[count++] = sig[i];
			}else{
				
			
			arr[count][0]+=sig[n].getB();
			}
		}
		
		for(int i = 0;i<count;i++){
			none[i].setA(arr[count][0]-none[i].getA());
			none[i].setB(arr[count][0]-none[i].getB());
		}
		   //Collections.sort(none, new IntervalComparator());

	        v first = none[0];
	        int start = first.getA();
	        int end = first.getB();

	        ArrayList<v> result = new ArrayList<v>();

	        for (int i = 1; i < none.length; i++) {
	            v current = none[i];
	            if (current.getA() <= end) {
	                end = Math.max(current.getB(), end);
	            } else {
	                result.add(new v("none",start, end));
	                start = current.getA();
	                end = current.getB();
	            }
	        }

	        System.out.print(start-before);
	        System.out.println(end-before);
	        
	        
		
	}
	class IntervalComparator implements Comparator
	{
	    public int compare(Object o1, Object o2)
	    {
	        v i1 = (v)o1;
	        v i2 = (v)o2;
	        return i1.a - i2.a;
	    }
	}
	public static class v{
		int a;
		int b;
		String io;
		public v(String io,int a, int b){
			this.io = io;
			this.a = a;
			this.b = b;
			
		}
		public String getIO(){
			return io;
		}
		public void setA(int a){
			this.a = a;
			
		}
		public void setB(int b){
			this.b = b;
		}
		public int getA(){
			return a;
		}
		public int getB(){
			return b;
		}
	}
}
