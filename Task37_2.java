package com.epam.les02.main;
/*
 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
 */
public class Task37_2 {

	public static void main(String[] args) {
		
		int N;
		int a;
		int b1;
		int b2;
		b1=0;
		b2=0;
		
		
		N=3674;
		
		for (int i=0; i<4; i++) {
			a=N%10;
			if (i==0 || i==2) {
				b1=b1+a;
			}
			if (i==1 || i==3) {
				b2=b2+a;
			}
			N/=10;
		}
		
		if (b1==b2) {System.out.println("True");}
		
	}

}
