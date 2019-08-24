package com.epam.les02.main;
/*
 * Сумма каких-либо двух цифр заданного 
 * трехзначного натурального числа N равна третьей цифре. 
 */
public class Task37_7 {

	public static void main(String[] args) {
		
		int N;
		int a;
		int b;
		int c;
		int k;
		N=330;
		
		a=0;
		b=0;
		c=0;
		
		for (int i=0; i<3; i++) {
			k=N%10;
			if (i==0) {
				c=k;
			} else
			if (i==1) {
				b=k;
			} else
			if (i==2) {
				a=k;
			}
			N/=10;
			
		}
		
		if ((a+b)==c || (c+b)==a || (a+c)==b) {
			System.out.println("True");
		}

	}

}
