package com.epam.les02.main;
/*
 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. 
 */
public class Task18 {

	public static void main (String[] args) {
		double a;
		double square;
		double square2;
		double volume;
		a=2;
		
		square=a*a;
		square2=square*6;
		volume=square*a;
		
		System.out.println("Площадь грани: "+square+"\n" +"Площадь куба: "+square2+"\n" +
							"Объём куба: "+volume);
	
		
	}
}
