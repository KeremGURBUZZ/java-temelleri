package Kosullar;

import java.util.Scanner;

public class Kosullar01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int sayi = scanner.nextInt();
		
		if(sayi > 100) 
		{
			sayi = sayi / 2;
		}
		System.out.println(sayi);
		

	}

}
