package com.epam.les02.main;
/*
 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и  а10 за четыре операции.
 */
public class Task27 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		a=2;
		
		b=a*a;
		c=b*b;
		d=c*c;
		a=d*b;
		System.out.println("В восьмой степени: "+d+"\n"+"В десятой степени: "+a);
		
		
		
	}

}
