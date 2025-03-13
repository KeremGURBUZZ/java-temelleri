package Donguler;

import java.util.Scanner;

public class Donguler05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int toplamCift = 0;
		int toplamTek = 0;
		
		int i = 0;
		int sayi;
		while(i < 10) 
		{
			System.out.print((i+1) + ".ci sayıyı giriniz :");
			sayi = scanner.nextInt();
			if(i % 2 == 0) 
			{
				toplamCift += sayi;
			}
			else 
			{
				toplamTek += sayi;
			}
			i++;
		}
	     	
		System.out.println(" ");
		System.out.println("----------------------------");
		System.out.println(" ");
		
		System.out.println("Tek sayıların toplamı :" + toplamTek);
		System.out.println("Çift sayıların toplamı :" + toplamCift);
		

	}

}
