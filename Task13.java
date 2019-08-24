package com.epam.les02.main;
/*
  Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь. 
 */
public class Task13 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double per;
		double hper;
		double square;
		
		double a;
		double b;
		double c;
		
		x1=1;
		y1=1;
		x2=1;
		y2=4;
		x3=5;
		y3=1;
		
		a=Math.hypot((x1-x2),(y1-y2));
		b=Math.hypot((x1-x3),(y1-y3));
		c=Math.hypot((x2-x3),(y2-y3));
		
		per=a+b+c;
		hper=per/2;
		
		square=Math.sqrt(hper*(hper-a)*(hper-b)*(hper-c));
		
		System.out.println("Периметр: "+per+"\n"+
							"Площадь: "+square);
				
		
	}
}
