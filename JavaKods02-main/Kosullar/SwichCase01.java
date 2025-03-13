package Kosullar;

import java.util.Scanner;

public class SwichCase01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Üniversite kaçıncı sınıftasınız? : ");
		byte sinif = scanner.nextByte();
		
		switch(sinif) 
		{
		case 1:
			System.out.println("ÇAYLAK");
			break;
		case 2:
			System.out.println("KALFA");
			break;
		case 3: 
			System.out.println("USTA");
			break;
		case 4:
			System.out.println("ÜSTAT");
			break;
		default:
			System.out.println("Geçerli bir değer giriniz..");
		}
		

	}

}
