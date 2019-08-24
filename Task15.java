package com.epam.les02.main;
/*
 15. Написать программу, которая выводит на экран первые четыре степени числа π. 
 */
public class Task15 {

	public static void main(String[] args) {
		double a;
		int b;
		
		a=Math.PI*10000;
		b=(int)Math.round(a);
		a=(double)b/10000;
		
		System.out.println("PI: "+a+"\n");
		
		

	}

}
