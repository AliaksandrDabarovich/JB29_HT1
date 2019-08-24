package com.epam.les02.main;
/*
 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. 
 */
import static java.lang.Math.PI;
public class Task14 {

	public static void main(String[] args) {
		double R;
		double C;
		double square;
		
		R=3;
		
		C=2*PI*R;
		square=PI*R*R;
		
		System.out.println("Длина окружности: " + C+"\n"+"Площадь круга: "+square);
		

	}

}
