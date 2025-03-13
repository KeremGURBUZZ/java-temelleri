package Metodlar;

import java.util.Scanner;

public class Metodlar02 {
	
	public static void ortalamaAl(int sayi1 , int sayi2) 
	{
		int toplam = sayi1 + sayi2;
		double ortalama = toplam / 2;
		System.out.println("Girilen sayıların ortalaması :" + ortalama);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz : ");
		int sayi1 = scanner.nextInt();
		
		System.out.print("İkinci sayıyı giriniz : ");
		int sayi2 = scanner.nextInt();

		ortalamaAl(sayi1, sayi2);
		
		

	}

}
