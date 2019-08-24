package com.epam.les02.main;
/*
 * Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. 
 */
public class Task37_5 {

	public static void main(String[] args) {
		int N;
		int a;
		int b;
		int sum;
		
		sum=0;
		N=120;
		a=N*N;

		for (int i=0; i<3; i++) {
			a=N%10;
			sum+=a;
			N/=10;
			
		}
		b=(int)Math.pow(sum, 3);
		if (a==b) {
			System.out.println("True");
		}
		
		
		

	}

}
