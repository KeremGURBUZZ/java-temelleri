package Metodlar;

import java.util.Scanner;

public class Metotlar03 {
	
	public static void buyukBul(int sayi1 , int sayi2) 
	{
		if(sayi1 > sayi2) 
		{
			System.out.println(sayi1 + " Büyüktür " + sayi2 + " den.");
		}
		else if(sayi2 > sayi1)
		{
			System.out.println(sayi2 + " Büyüktür " + sayi1 + " den.");
		}
		else 
		{
			System.out.println("Her iki sayıda eşittir.");
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Sayıyı giriniz :");
		int sayi1 = scanner.nextInt();
		
		System.out.print("2. Sayıyı giriniz :");
		int sayi2 = scanner.nextInt();
		
		buyukBul(sayi1 , sayi2);
		

	}

}
