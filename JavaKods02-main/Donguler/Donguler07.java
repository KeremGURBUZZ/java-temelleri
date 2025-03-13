package Donguler;

import java.util.Scanner;

public class Donguler07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayi;
		while(true) 
		{
			System.out.print("Sayı giriniz :");
			sayi = scanner.nextInt();
			if(sayi == 0) 
			{
				break;
			}
			else 
			{
				toplam = toplam + sayi;
			}
		}
		System.out.println("Toplam :" + toplam);
		

	}

}
