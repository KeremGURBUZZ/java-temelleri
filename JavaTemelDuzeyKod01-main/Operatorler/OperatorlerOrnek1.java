package Operatorler;

import java.util.Scanner;

public class OperatorlerOrnek1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Degeri Giriniz :");
		
		int deger1 = scanner.nextInt();
		
		System.out.println("2. Degeri Giriniz :");
		
		int deger2 = scanner.nextInt();
		
		if(deger1>deger2) {
			
			System.out.println("Kazandınız!");
			
		}else {
			
			System.out.println("Kaybettiniz :(");
			
		}
		
		
		
		
		
		

	}

}
