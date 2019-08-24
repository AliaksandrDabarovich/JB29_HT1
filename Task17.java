package com.epam.les02.main;
/*
 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел. 
 */
public class Task17 {

	public static void main(String[] args) {
		double a;
		double b;
		double ar;
		double geom;
		
		a=2;
		b=3;
		
		ar=(Math.pow(a, 3)+Math.pow(b, 3))/2;
		geom=Math.sqrt(Math.abs(a)*Math.abs(b));
		
		System.out.println("Среднее арифметическое: "+ ar+ "\n"+ 
							"Среднее геометрическое: "+geom);
		
		
		

	}

}
