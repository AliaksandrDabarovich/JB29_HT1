package com.epam.les02.main;
/*
 31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч. 
 */
public class Task31 {

	public static void main(String[] args) {
		
		double v;
		double v1;
		double t1;
		double t2;
		
		double s;
		
		v=5;
		v1=2;
		t1=1;
		t2=3;
		
		
		s=v*t1+(v-v1)*t2;
		
		System.out.println("Время в пути: "+ s);
		
		
		
		
		
		
	}

}
