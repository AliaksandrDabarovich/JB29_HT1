package com.epam.les02.main;
/*
 35. Даны натуральные числа М и N. Вывести старшую цифру 
 дробной части и младшую цифру целой части числа M/N.
 */
public class Task35 {

	public static void main(String[] args) {
		
		
		double M;
		double N;
		double k;
		int MIN;
		int MAX;
		int p;
		
		
		
		MAX=0;
		M=1315;
		N=20;
		k=M/N;
		MIN=(int)k%10;
		
		
		while (((int)k%10)>0) {
			
			if (k%10<MIN) {
				MIN=(int)k%10;
			}
			k=k/10;
		}
		
		k=M/N;
		
		do {
			p=(int)((k-(int)k)*10);
			if (p>MAX) {
				MAX=p;
			}
			k=k*10;
		}		
		while (p>0) ;
		
		
		
		System.out.println(MAX+"\n"+MIN+"\n");
	
		
		}
		
}

