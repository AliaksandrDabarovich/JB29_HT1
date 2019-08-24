package com.epam.les02.main;
/*
 24. Найти площадь равнобедренной трапеции с основаниями а и  b  и углом α при большем основании а. 
 */
public class Task24 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double h;
		double alf;
		double square;
		
		a=6;
		b=3;
		alf=0.785398;
		
		c=(a-b)/(2*Math.cos(alf));
		h=c*Math.sin(alf);
		
		square=(a+b)/2*h;
		
		System.out.println("Площадь: "+ square);
		
		

	}

}
