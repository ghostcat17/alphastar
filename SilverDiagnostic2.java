package alphaStar;

import java.io.*;

public class SilverDiagnostic2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		PrintWriter pw;
		String[] id;
		int nOC;
		String temp;
		int cN;
		int index;
		int count = 0;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream("alphaStar/proximity.in")));
			pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("alphaStar/proximity.out")));
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Try a different file");
		}
		
	
		//create array(size given from the in file) that tracks the id
		temp = br.readLine();
		System.out.println(temp.charAt(0));
		nOC = temp.charAt(0)-'0';
		cN = temp.charAt(2)-'0';
		id = new String[nOC]; 
		
		//iterate through using while loop and add in to array
		index = 0;
		while((temp=br.readLine())!=null){
			id[index] = temp;
			index++;
		}
		
		//iterate through array check *insert number from in file* before and after
		for(int i = 0;i<id.length;i++){
			
			
			if(i>=cN){
				
				for(int j = 1;j<=id.length-i-1;j++){
					print(id);
					System.out.println(id[i]);
					System.out.println(id[i+j]);
						if(Integer.valueOf(id[i])==Integer.valueOf(id[i+j])){
							System.out.println(id[i+j]);
							
						
						count++;
						
					}
				}
			}
			else{
				for(int j = 1;j<=3;j++){
					print(id);
					System.out.println(id[i]);
					System.out.println(id[i+j]);
					if(Integer.valueOf(id[i])==Integer.valueOf(id[i+j])){
						
						count++;
					}
				}
			}
		}
		System.out.println();
		System.out.println(count*2);
		}
	
	public static void print(String[] a){
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]);
			
		}
		System.out.println();
	}

}
