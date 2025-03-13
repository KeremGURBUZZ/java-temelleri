package Kosullar;

import java.util.Scanner;

public class Kosullar02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Sayıyı giriniz : ");
		int sayi1 = scanner.nextInt();
		System.out.println("2. Sayıyı giriniz : ");
		int sayi2 = scanner.nextInt();
		int toplam = sayi1 + sayi2;
		
		if(toplam > 10) 
		{
			System.out.println("KAZANDINIZ!");
		}
		else 
		{
			System.out.println("KAYBETTİNİZ!");
		}
		
	}

}
