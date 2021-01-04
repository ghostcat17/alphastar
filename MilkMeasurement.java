package alphaStar;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class MilkMeasurement {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int cows = Integer.valueOf(st.nextToken());
		int leaderID = 0;
		days[] days = new days[n];
		int count = 0;
		int currentCowID = 0;
		for(int i = 0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			int day = Integer.valueOf(st.nextToken());
			int id = Integer.valueOf(st.nextToken());
			String token = st.nextToken();
			boolean sign = false;
			
			
			if(token.charAt(0)=='+')sign = true;
			
			int change = Integer.valueOf(token.substring(1));
			days[i] = new days(day,id,sign,change);
			
			map.put(days[i].getID(), cows);
			
		}
		leaderID = days[0].getID();
		Arrays.sort(days);
		for(int i = 0;i<days.length;i++){
			int value = map.get(days[i].getID());
			if(days[i].getSign())value+=days[i].getChange();
			if(!days[i].getSign())value-=days[i].getChange();
			
			
			map.put(days[i].getID(), value);
			
			Map.Entry<Integer, Integer> maxEntry = null;
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			   if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
			      maxEntry = entry;
			}
			
			currentCowID = maxEntry.getKey();
			if(map.get(currentCowID)>=map.get(leaderID)&&currentCowID!=leaderID){
				leaderID = currentCowID;
				
				count++;
			}
		}
		System.out.println(count);
	
	}
	
	public static class days implements Comparable<days>{
		private int id;
		private int day;
		private boolean sign;
		private int change;
		public days(int day, int id, boolean sign, int change){
			this.id = id;
			this.day = day;
			this.sign = sign;
			this.change = change;
		}
		public boolean getSign(){
			return sign;
		}
		public int getID(){
			return id;
		}
		public int getDay(){
			return day;
		}
		public int getChange(){
			return change;
		}
		@Override
		public int compareTo(days o) {
			if(this.day>o.day)return 1;
			if(this.day<o.day)return -1;
			else return 0;
		}
		
	}
	

}
