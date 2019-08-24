package com.epam.les02.main;
/*
 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2). 
 */
public class Task12 {

	public static void main(String[] args) {
		
		double x1;
		double y1;
		double x2;
		double y2;
		double res;
		
		x1=1;
		y1=2;
		x2=-2;
		y2=-5;
		
		res=Math.hypot((x1-x2),(y1-y2));
		
		System.out.println("Расстояние между двумя точками равно: "+res);
		

	}

}
