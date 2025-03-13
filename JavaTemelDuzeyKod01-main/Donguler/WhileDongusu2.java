package Donguler;

import java.util.Scanner;

public class WhileDongusu2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir isim giriniz :");
		
		String ad = scanner.nextLine();
		
		int caunt = 5;
		
		while(!ad.toLowerCase().contains("a")) {
			
			if(caunt == 0) {
				
				break;
				
			}
			
			System.out.println("Olmadı lütfen baska isim gir :");
			
			ad = scanner.nextLine();
			
			caunt--;
			
		}
		
		if(ad.contains("a") || ad.contains("A")) {
			
			System.out.println("Adiniz :" + ad);
			
		}else {
			
			System.out.println("Aradigim ismi girmediniz");
			
		}
		
	}

}
