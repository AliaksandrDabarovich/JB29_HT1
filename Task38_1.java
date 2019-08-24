package com.epam.les02.main;
/*
 *  Для данных областей составить линейную программу, которая печатает true, 
 *  если точка с координатами (х, у) 
 *  принадлежит закрашенной области, и false — в противном случае:
 */
public class Task38_1 {

	public static void main(String[] args) {
		
		int x;
		int y;
		x=2;
		y=-2;
		if ( (y<=(x+4)) && (y<=(-1*x+4)) && y>=0) {
			System.out.println("True");
		} else
		{System.out.println("False");}
		
	}

}
