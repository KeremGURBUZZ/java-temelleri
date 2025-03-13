package Donguler;

import java.util.Scanner;

public class Donguler08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayi;
		do 
		{
			System.out.print("Sayı giriniz :");
			sayi = scanner.nextInt();
			toplam = toplam + sayi;
		}while(sayi != 0);
		
		System.out.println("Toplam :" + toplam);

	}

}
