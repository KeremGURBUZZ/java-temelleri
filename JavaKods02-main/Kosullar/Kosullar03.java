package Kosullar;

import java.util.Scanner;

public class Kosullar03 {

	public static void main(String[] args) {
		// Reşitlik kontrolü yapan uygulama
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum tarihinizi (yıl) giriniz : ");
		int dogumTarihi = scanner.nextInt();
		int yas;
		yas = 2024 - dogumTarihi;
		
		if(yas >= 18) 
		{
			System.out.println("Reşitsiniz");
		}
		else 
		{
			System.out.println("Reşit değilsiniz");
		}

	}

}
