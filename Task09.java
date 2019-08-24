package com.epam.les02.main;

/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑎 𝑐 ∗ 𝑏 𝑑 − 𝑎𝑏 − 𝑐 𝑐𝑑
 
 */

public class Task09 {
	
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double res;
		
		a=1;
		b=2;
		c=3;
		d=4;
		
		res=(a/c)*(b/d)-(a*b-c)/(c*d);
		System.out.println("Результат выражения: "+res);
		
	}

}
