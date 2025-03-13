package kapsullemeOrnek;

import java.util.Scanner;

public class KapsullemeOrnek01 {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Öğrenci adı : ");
		String ad = scanner.nextLine();
		System.out.print("Öğrenci soyadı : ");
		String soyAd = scanner.nextLine();
		
		System.out.print("Öğrenci okul no : ");
		int okulNo = scanner.nextInt();
		System.out.print("Öğrenci doğum yılı : ");
		int dogumYili = scanner.nextInt();
		
		
		ogrenci.setAd(ad);
		ogrenci.setSoyAd(soyAd);
		ogrenci.setOkulNo(okulNo);
		ogrenci.setDogumYili(dogumYili);
		

	}

}
