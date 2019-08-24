package com.epam.les02.main;
/*
 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа. 
 */
public class Task21 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double z;
		double res;
		
		a=222.555;
		
		z=(int)a;
		b=z/1000;
		c=a%z;
		d=Math.round(c*1000);
		res=b+d;
		
		System.out.println("Первоначальное число: "+a+"\n" +"Результат: "+res);
		

	}

}
