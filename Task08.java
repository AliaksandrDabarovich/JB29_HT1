package com.epam.les02.main;
/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2 
 */
public class Task08 {
	
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double res;
		a=1;
		b=2;
		c=3;
		
		res=(b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);
		System.out.println(res);
		
	}
	

}
