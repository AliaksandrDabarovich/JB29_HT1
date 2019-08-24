package com.epam.les02.main;
/*
 * Сумма цифр данного трехзначного числа N является четным числом. 
 */
public class Task37_3 {

	public static void main(String[] args) {
		int N;
		int a;
		int sum;
		sum=0;
		
		N=242;
		
		for (int i=0; i<3; i++) {
			a=N%10;
			sum+=a;
			N/=10;
			
		}
		
		if (sum%2==0) {
			System.out.println("True");
		}

	}

}
