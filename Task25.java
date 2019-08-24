package com.epam.les02.main;
/*
25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).  
 */
public class Task25 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x1;
		double x2;
		
		a=1;
		b=3;
		c=-4;
		
		x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println("Корень 1: "+x1+"\n" +"Корень 2: "+x2);
		
		

	}

}
