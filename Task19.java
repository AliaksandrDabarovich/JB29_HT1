package com.epam.les02.main;
/*
 19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей. 
 */
public class Task19 {

	public static void main (String[] args) {
		double a;
		double square;
		double h;
		double R;
		double R2;
		double hper;
		a=3;
		hper=3*a/2;
		square=Math.sqrt(hper*3*(hper-a));
		h=2*square/a;
		R=a/(2*Math.sqrt(3));
		R2=R*2;
		
		System.out.println(
				"Площадь треугольника: "+square+"\n" +"Высота треугольника: "+h+"\n" +
						"Радиус вписанной окружности: "+R+"\n" +
						"Радиус описанной окружности: "+R2
						);
		
	}
}
