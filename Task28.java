package com.epam.les02.main;
/*
 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды. 
 */

public class Task28 {
public static void main(String[] args) {
		
		double a;
		double b;
		int grad;
		int min;
		int sec;
		
		a=0.38;
		b=a*(180/Math.PI);
		grad=(int)Math.floor(b);
		min=(int)Math.floor((b-grad)*60);
		sec=(int)Math.floor(((b-grad)*60-min)*60);
		System.out.println(grad+"°" +min+"\'"+sec+"\"");
		
	}

}