package com.epam.les02.main;
/*
 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения. 
 
 */
public class Task30 {

	public static void main(String[] args) {
		
		double R1;
		double R2;
		double R3;
		double RSUM;
		
		R1=200;
		R2=300;
		R3=400;
		
		RSUM=(R1*R2*R3)/(R1*R2+R2*R3+R1*R3);
		
		System.out.println("Общее сопротивление: "+ RSUM);
		
		
	}

}
