package com.epam.les02.main;
/*
 *  Дано значение х. Получить значения  -2х + 3х2 - 4х3  
 *  Позаботьтесь об экономии операций. 
 */
public class Task40_1 {

	public static void main(String[] args) {
		int x;
		int y;
		
		x=2;
		y=x*((-2)*(1-x)-3*x*x);
		
		System.out.println(y);

	}

}
