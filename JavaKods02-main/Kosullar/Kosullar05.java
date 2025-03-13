package Kosullar;

import java.util.Scanner;

public class Kosullar05 {

	public static void main(String[] args) {
		// NOT HESAPLAYAN UYGULAMA
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vize notunuzu giriniz : ");
		int vizeNotu = scanner.nextInt();
		System.out.print("Final notunuzu giriniz : ");
		int finalNotu = scanner.nextInt();
		double ortalama = vizeNotu * 0.4 + finalNotu *0.6;
		
		if(ortalama >= 90) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" AA");
		}
		else if(ortalama >= 85) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" AB");
		}
		else if(ortalama >= 80) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" BA");
		}
		else if(ortalama >= 75) 
		{
			System.out.println("Not ortalamanız : " + "BB");
		}
		else if(ortalama >= 70) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" CA");
		}
		else if(ortalama >= 65) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" CB");
		}
		else if(ortalama >= 60) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" CC");
		}
		else if(ortalama >= 55) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" DC");
		}
		else if(ortalama >= 50) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" DD");
		}
		else if(ortalama >= 0) 
		{
			System.out.println("Not ortalamanız : " + ortalama +" FF");
		}
		else 
		{
			System.out.println("Bir hata oluştu lütfen doğru bir değer girdiğinizden emin olun.");
		}
		
		
		
	}
}