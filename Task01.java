package com.epam.les02.main;
/*
1. Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное. 
*/
public class Task01 {
	
public static void main (String [] args) {
	double x;
	double y;
	double add;
	double sub;
	double mult;
	double div;
	
	x=2;
	y=3;
	add=x+y;
	sub=x-y;
	mult=x*y;
	div=x/y;
	
	System.out.println(
			"Сумма чисел равна " + add +"\n"+
			"Разность чисел равна " + sub +"\n"+
			"Произведение чисел равно " + mult +"\n"+
			"Частное чисел равно " + div +"\n"
			);
}

}
