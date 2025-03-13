package Donguler;

import java.util.Scanner;

public class Donguler03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen birinci sayıyı giriniz :");
		int sayi1 = scanner.nextInt();
		System.out.print("Lütfen ikinci sayıyı giriniz :");
		int sayi2 = scanner.nextInt();
		
		for(int i = sayi1; i <= sayi2; i++) 
		{
			if(i % 2==0) 
			{
				System.out.println("Girilen değerler arasındaki çift sayılar :" + i);
			}
		}
		
		

	}

}
