package com.epam.les02.main;
/*
 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с? 
 */
public class Task32 {

	public static void main(String[] args) {
		int m;
		int n;
		int k;
		int m1;
		int n1;
		int k1;
		
		int ost;
		ost=0;
		int ost2;
		ost2=0;
		
		
		int p;
		int q;
		int r;
		
		m=22;
		n=45;
		k=13;
		
		p=12;
		q=40;
		r=120;
		
		k1=r+k;
		if (k1>59) {
			k1=k1%59;
			ost=(int)(Math.floor((r+k)/59));
		}
		
		n1=n+q+ost;
		if (n1>59) {
			n1=(n1%59);
			ost2=(int)(Math.floor((n+q+ost)/59));
		}
		
		m1=m+p+ost2;
		if (m1>23) {
			m1=(int)m1%23;
			
		}
		
		
		System.out.println(m1+"часов "+n1+"минут "+k1+"секунд ");
		

	}

}
