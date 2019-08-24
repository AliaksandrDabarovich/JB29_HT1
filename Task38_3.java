package com.epam.les02.main;
/*
 *  Для данных областей составить линейную программу, которая печатает true, 
 *  если точка с координатами (х, у) 
 *  принадлежит закрашенной области, и false — в противном случае:
 */
public class Task38_3 {

	public static void main(String[] args) {
		
		int x;
		int y;
		x=3;
		y=-3;
		
		if (( (x*x+y*y<=16) && (x>=0) && (y>=0))||((x>=0) && (y<=0) && (x*x+y*y<=25) )) {
			System.out.println("True");
		} else
		{System.out.println("False");}
		
	}

}
