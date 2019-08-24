package com.epam.les02.main;
/*
 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью. 
 */
import static java.lang.Math.PI;

public class Task20 {

	public static void main(String[] args) {
		double C;
		double square;
		C=4;
		
		square=Math.pow(C/(2*PI), 2)*PI;
		
		System.out.println("Площадь круга: "+square);
		
		

	}

}
