package com.epam.les02.main;
/*
 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. 
 */
public class Task22 {

	public static void main(String[] args) {
		int T;
		int HH;
		int MM;
		int SS;
				
		T=5555;
		HH=(int)Math.floor(T/3600);
		MM=(int)Math.floor((T-3600*HH)/60);
		SS=(T-3600*HH-60*MM);
		
		
		System.out.println(HH+"ч " +MM+"мин "+SS+"с");
		
		
		
		

	}

}
