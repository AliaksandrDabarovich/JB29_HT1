package com.epam.les02.main;
/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦 ∗ 𝑡𝑔 𝑥𝑦 
 */
public class Task10 {

	public static void main(String[] args) {
		
		double x;
		double y;
		double res;
		
		x=0.523599;
		y=0.785398;
		
		res=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
		
		System.out.println("Значение выражения: "+res);

		
	}

}
