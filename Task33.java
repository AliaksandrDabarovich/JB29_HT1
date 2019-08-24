package com.epam.les02.main;
/*
 33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
 */
public class Task33 {

	public static void main(String[] args) {
		
		char k;
		int s;
		char s2;
		char s0;
		
		k='g';
		s=(int)k;
		s2=(char)(s+1);
		s0=(char)(s-1);
		
		
		
		System.out.println("Порядковый номер g: "+s+"\n"+"Предыдущий символ: "+s0+"\n"+"Следущий символ: "+s2+"\n");

	}

}
