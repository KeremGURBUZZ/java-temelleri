package Degiskenler;

import java.util.Scanner;

public class DegiskenlerOrnek2 {

	public static void main(String[] args) {
		// DİKDÖRTGENİN ÇEVRESİNİ HESAPLAYAN PROGRAMI GİRİN
		
		System.out.println("Çevreyi Hesaplamam İçin Bana Yardımcı Ol ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Uzun Kenar :");
		
		int uzunKenar = scanner.nextInt();
		
		System.out.println("Kısa Kenar :");
		
		int kısaKenar = scanner.nextInt();
		
		int cevre = (uzunKenar+kısaKenar) * 2;
		
		System.out.println("Dikdörtgenin Çevresi :"+ cevre);

	}

}
