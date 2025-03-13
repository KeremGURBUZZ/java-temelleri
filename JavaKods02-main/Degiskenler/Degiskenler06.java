package Degiskenler;

import java.util.Scanner;

public class Degiskenler06 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dikdörtgenin kısa kenarını giriniz : ");
		int kısaKenar = scanner.nextInt();
		System.out.print("Dikdörtgenin uzun kenarını giriniz : ");
		int uzunKenar = scanner.nextInt();
		int cevre = kısaKenar * uzunKenar;
		System.out.println("Dikdörtgenin çevresi : " + cevre);

	}

}
