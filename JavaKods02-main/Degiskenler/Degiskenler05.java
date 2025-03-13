package Degiskenler;

import java.util.Scanner;

public class Degiskenler05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yarıçap değerini giriniz : ");
		int yaricap = scanner.nextInt();
		int pi = 3;
		int cevre = 2 * pi * yaricap;
		System.out.println("Çemberin çevresi : " + cevre);
		

	}

}
