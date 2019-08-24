package com.epam.les02.main;
/*
 16. Найти произведение цифр заданного четырехзначного числа.
 */
public class Task16 {

	public static void main (String[] args) {
		int a;
		int b1;
		int b2;
		int b3;
		int b4;
		int mult;
		
		
		a=4362;
		
		b1=(int)Math.floor(a/1000);
		b2=(int)Math.floor(a/100)%10;
		b3=(int)Math.floor(a/10)%10;
		b4=a%10;
		
		mult=b1*b2*b3*b4;
		
		
		
		
		System.out.println("Произведение цифр: "+mult);
		
	}
}
