package com.epam.les02.main;
/*
 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.
 */
public class Task11 {

	public static void main (String[] args) {
		double a;
		double b;
		
		double square;
		double perimeter;
		
		a=3;
		b=2;
		
		
		perimeter=Math.sqrt(a*a+b*b)+a+b;
		square=a*b/2;
		
		System.out.println("Периметр треугольника: "+perimeter+"\n"+
							"Площадь треугольника: "+square);
		
		
	}
}
