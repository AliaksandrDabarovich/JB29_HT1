package com.epam.les02.main;
/*
 *  Дано значение х. Получить значения  
 *   1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций. 
 */
public class Task40_2 {

	public static void main(String[] args) {
		int x;
		int y;
		
		x=2;
		y=(1+2*x)*(1+2*x*x)+x*x;
		
		System.out.println(y);

	}

}
