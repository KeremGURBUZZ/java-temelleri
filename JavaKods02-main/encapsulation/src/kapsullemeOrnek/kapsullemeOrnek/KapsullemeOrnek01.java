package kapsullemeOrnek;

import java.util.Scanner;

public class KapsullemeOrnek01 {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci();
		
		ogrenci.setAd("Çağla");
		ogrenci.setSoyAd("Gürbüz");
		ogrenci.setOkulNo(2145);
		ogrenci.setDogumYili(2003);
		
		ogrenci.bilgileriGoster();
		
		System.out.println(" ");
		System.out.println("------------------------");
		System.out.println(" ");
		
		System.out.println(ogrenci);
		

		
	}

}
