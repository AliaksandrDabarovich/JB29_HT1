package com.epam.les02.main;
/*
 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с. 
 
 */
public class Task29 {
public static void main(String[] args) {
		
		double alf;
		double bet;
		double gam;
		double agrad;
		double bgrad;
		double ggrad;
		
	
		double a;
		double b;
		double c;
		
		
		
		a=2;
		b=3;
		c=4;
		
		alf=Math.acos((b*b+c*c-a*a)/(2*b*c));
		bet=Math.acos((a*a+c*c-b*b)/(2*a*c));
		gam=Math.acos((a*a+b*b-c*c)/(2*a*b));
		
		agrad=alf*(180/Math.PI);
		bgrad=bet*(180/Math.PI);
		ggrad=gam*(180/Math.PI);
		
		
		
		
		System.out.println("Альфа в радианах: "+alf+"\n"+"Бета в радианах: "+bet+"\n"+
				"Гамма в радианах: "+gam+"\n"+"Альфа в градусах: "+agrad+"\n"+
				"Бета в градусах: "+bgrad+"\n"+"Гамма в градусах: "+ggrad+"\n");
		
				
		
		
	}
}
