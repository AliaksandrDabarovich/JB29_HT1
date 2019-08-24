package com.epam.les02.main;
/*
 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у. 
 */
public class Task26 {

	public static void main(String[] args) {
		double a;
		double b;
		double alf;
		double square;
		
		a=6;
		b=4;
		alf=0.523599;
		
				
		square=(0.5*a*b*Math.sin(alf));
		
		System.out.println("Площадь: "+ square);

	}

}
