package com.epam.les02.main;
/*
 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r). 
 */
public class Task23 {

	public static void main(String[] args) {
		double R;
		double r;
		double S;
		
		R=7;
		r=4;
		S=Math.PI*(R*R-r*r);
		System.out.println("Площадь: "+ S);

	}

}
