package enumusingconstructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class enumclass1 {

	enum MONTHLIST{
		
		JAN("january",31),
		FEB("february",28),
		MAR("march",31),
		APR("april",30),
		MAY("may",31),
		JUN("june",30),
		JUL("july",31),
		AUG("august",31),
		SEP("september",30),
		OCT("october",31),
		NOV("november",30),
		DEC("december",31);

		private final String monthname;
		private final int date;
		
		private MONTHLIST(String monthname,int date) {
			this.monthname = monthname;
			this.date = date;
		}

		public String getMonthname() {
			return monthname;
		}
		
		public int getDate() {
			return date;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ch;
		MONTHLIST[] montharray = MONTHLIST.values();
		
		Scanner scan= new Scanner(System.in);
		do {
		System.out.println("Input the String (Example: JAN):");

		String str=scan.nextLine();
		
		for(MONTHLIST m: montharray)
			{
			
//				System.out.println("Month: "+m.getMonthname());
//				System.out.println("Date : "+ m.getDate());
				switch(str) {
				case "JAN": 
					
					if(m.name() == "JAN") {
						System.out.println("Month: "+m.getMonthname());
						System.out.println("Date : "+ m.getDate());
						
					}
					break;
				
				case "FEB": 
					
					if(m.name() == "FEB") {
						System.out.println("Month: "+m.getMonthname());
						System.out.println("Date : "+ m.getDate());
						
					}
					break;
				case "MAR": 
					
					if(m.name() == "MAR") {
						System.out.println("Month: "+m.getMonthname());
						System.out.println("Date : "+ m.getDate());
						
					}
					break;
				case "APR": 
					
					if(m.name() == "APR") {
						System.out.println("Month: "+m.getMonthname());
						System.out.println("Date : "+ m.getDate());
						
					}
					break;
				case "MAY": 
					
					if(m.name() == "MAY") {
						System.out.println("Month: "+m.getMonthname());
						System.out.println("Date : "+ m.getDate());
						
					}
					break;
				case "JUN": 
					
					if(m.name() == "JUN") {
						System.out.println("Month: "+m.getMonthname());
						System.out.println("Date : "+ m.getDate());
						
					}
					break;
				case "JUL": 
					
					if(m.name() == "JUL") {
						System.out.println("Month: "+m.getMonthname());
						System.out.println("Date : "+ m.getDate());
						
					}
					break;
				}
				
		}
		
		}while(true);
		
	}

}
