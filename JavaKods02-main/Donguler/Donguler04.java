package Donguler;

import java.util.Scanner;

public class Donguler04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen birinci sayıyı giriniz :");
		int sayi1 = scanner.nextInt();
		System.out.print("Lütfen ikinci sayıyı giriniz :");
		int sayi2 = scanner.nextInt();
		
		if(sayi1 > sayi2) 
		{
			System.out.println("Lütfen birinci sayıyı küçük girin.");
		}
		else 
		{
			int i = sayi1;
			while(i <= sayi2) 
			{
				if(i % 2 == 0) 
				{
					System.out.println(i);
				}
				i++;
			}
		}
		

	}

}
