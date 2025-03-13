package Kosullar;

import java.util.Scanner;

public class Kosullar04 {

	public static void main(String[] args) {
		// NOT HESAPLAYAN UYGULAMA
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vize notunuzu giriniz : ");
		int vizeNotu = scanner.nextInt();
		System.out.print("Final notunuzu giriniz : ");
		int finalNotu = scanner.nextInt();
		double ortalama = vizeNotu * 0.4 + finalNotu *0.6;
		
		if(ortalama >= 50) 
		{
			System.out.println("Dersten geçtiniz. Notunuz : " + ortalama);
		}
		else 
		{
			System.out.println("Dersten kaldınız. Notunuz : " + ortalama);
		}
	}

}
