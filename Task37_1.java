package com.epam.les02.main;

/*
 * 37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, 
 * и false — в противном случае: • Целое число N является четным двузначным числом.
 */
public class Task37_1 {

	public static void main(String[] args) {
		
		
		double N;
		N=44;
				
		if ((N%2)==0 &&  
				((9<N)&&(N<100)) || ((-100<N)&&(N<-9)) ) {
			System.out.println("True");
			
		} 

	}

}
