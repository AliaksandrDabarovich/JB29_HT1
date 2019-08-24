package com.epam.les02.main;
/*34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.

*/
public class Task34 {
	public static void main(String[] args) {
	
		int bite;
		int kilobite;
		int megabite;
		long gigabite;
		long terabite;
		
		bite=1;
		kilobite=1024*bite;
		megabite=1024*kilobite;
		gigabite=1024*megabite;
		terabite=1024*gigabite;
		
		
		System.out.println(
							"байт: "+bite+"\n"+
							"килобайт: "+kilobite+"\n"+
							"мегабайт: "+megabite+"\n"+
							"гигабайт: "+gigabite+"\n"+
							"терабайт: "+terabite+"\n");
		
		

	}
}

