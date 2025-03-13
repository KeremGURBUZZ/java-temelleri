package Donguler;

import java.util.Scanner;

public class Donguler02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz :");
		int deger = scanner.nextInt();
		int faktoriyel = 1;
		for(int i = 1; i <= deger; i++) 
		{
			faktoriyel = faktoriyel * i;
		}
		System.out.println("Girilen sayının faktoriyel değeri : " + faktoriyel);

	}

}
