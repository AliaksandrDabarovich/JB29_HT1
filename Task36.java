package com.epam.les02.main;

public class Task36 {

	public static void main(String[] args) {
		int a;
		int ost;
		double	chet;
		double	nechet;
		double res;
		
		
		nechet=1;
		chet=0;
		a=4365;
		
		
		for (int i=0; i<4; i++) {
			ost=a%10;
			if (ost%2==0) {
				if (chet==0) {
					chet=ost;
				} else {
				chet=ost*chet;}
			} 
			else {
				nechet=ost*nechet;
			}
			a=a/10;
			
			
			
		}
		res=chet/nechet;
		
		System.out.println("Частное:" + res);
	
		

	}

}
