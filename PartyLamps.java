package alphaStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PartyLamps {
	public static String [] finalSetup=new String [1000];
	public static int finalSetupCount=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		boolean [] lamps=new boolean [N];
		for (int i=0;i<N;i++) {
			lamps[i]=true;
		}
		int [] finalL=new int [N];
		int C=Integer.parseInt(br.readLine());
		String [] onL=br.readLine().split(" ");
		for (int i=0;i<onL.length-1;i++) {
			finalL[Integer.parseInt(onL[i])-1]=1;
		}
		String [] offL=br.readLine().split(" ");
		for (int i=0;i<offL.length-1;i++) {
			finalL[Integer.parseInt(offL[i])-1]=2;
		}
		loop(C,lamps,finalL);
		if (finalSetupCount==0) {
			System.out.println("IMPOSSIBLE");
		} else {
			Arrays.sort(finalSetup,0,finalSetupCount);
			for (int i=0;i<finalSetupCount;i++) {
				System.out.println(finalSetup[i]);
			}
		}
		
	}
	public static void loop (int butCount, boolean [] lamps, int [] finalLamps) {
		if (butCount==0) {
			boolean pass=true;
			for (int i=0;i<finalLamps.length;i++) {
				if ((finalLamps[i]==1 && !lamps[i]) || (finalLamps[i]==2 && lamps[i])) {
					pass=false;
					break;
				}
			}
			if (pass) {
				boolean contains=false;
				String s="";
				for (int i=0;i<lamps.length;i++) {
					if (lamps[i]) {
						s+="1";
					} else {
						s+="0";
					}
				}
				for (int i=0;i<finalSetupCount;i++) {
					if (finalSetup[i].equals(s)) {
						contains=true;
					}
				}
				if (!contains) {
					finalSetup[finalSetupCount++]=s;
				}
			}
		} else {
			
			butCount=butCount-1;
			loop(0,lamps,finalLamps);
			move1(lamps);
			loop(butCount%2,lamps,finalLamps);
			move1(lamps);
			move2(lamps);
			loop(butCount%2,lamps,finalLamps);
			move2(lamps);
			move3(lamps);
			loop(butCount%2,lamps,finalLamps);
			move3(lamps);
			move4(lamps);
			loop(butCount%2,lamps,finalLamps);
			move4(lamps);
			if (butCount>=2) {
				move1(lamps);
				move4(lamps);
				loop(butCount%2,lamps,finalLamps);
				move4(lamps);
				move1(lamps);
			}
			if (butCount>=3) {
				move1(lamps);
				move2(lamps);
				move4(lamps);
				loop(butCount%3,lamps,finalLamps);
				move4(lamps);
				move2(lamps);
				move1(lamps);
			}
			if (butCount>=4) {
				move1(lamps);
				move2(lamps);
				move1(lamps);
				move4(lamps);
				loop(butCount%4,lamps,finalLamps);
				move4(lamps);
				move1(lamps);
				move2(lamps);
				move1(lamps);
			}
		}
	}
	 public static boolean[] move1(boolean[] in)
	 {
	  boolean[] ret = new boolean[in.length];
	  for(int i = 0; i < ret.length;i++)
	  {
	   ret[i] = !in[i];
	  }
	  return ret;
	 }
	 public static boolean[] move2(boolean[] in)
	 {
	  boolean[] ret = new boolean[in.length];
	  for(int i = 0; i < ret.length;i++)
	  {
	   if(i%2 == 1)
	    ret[i] = !in[i];
	   else
	    ret[i] = in[i];
	  }
	  return ret;
	 }
	 public static boolean[] move3(boolean[] in)
	 {
	  boolean[] ret = new boolean[in.length];
	  for(int i = 0; i < ret.length;i++)
	  {
	   if(i%2 == 0)
	    ret[i] = !in[i];
	   else
	    ret[i] = in[i];
	  }
	  return ret;
	 }
	 public static boolean[] move4(boolean[] in)
	 {
	  boolean[] ret = new boolean[in.length];
	  for(int i = 0; i < ret.length;i++)
	  {
	   if(i%3 == 0)
	    ret[i] = !in[i];
	   else
	    ret[i] = in[i];
	  }
	  return ret;
	 }

}
