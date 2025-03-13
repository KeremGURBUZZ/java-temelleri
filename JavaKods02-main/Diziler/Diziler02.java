package Diziler;

import java.util.Scanner;

public class Diziler02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sayilar[] = new int[10];
		int tumToplam = 0;
		int ilkSonToplam = 0;
		
		for(int i = 0; i < 10; i++) 
		{
			System.out.print("Lütfen sayı giriniz : ");
			sayilar[i] = scanner.nextInt();
			tumToplam += sayilar[i];
		}
		
		ilkSonToplam = sayilar[0] + sayilar[9];
		
		double oran = ilkSonToplam / tumToplam;
		
		System.out.println("-------------------------");
		System.out.println("Dizinin toplamı : " + tumToplam);
		System.out.println("--------------------------");
		System.out.println("İlk ve son değerlerin toplamı : " + ilkSonToplam);
		System.out.println("---------------------------");
		System.out.println("İlk ve Son sayıların toplamına oranı : " + oran);
		    
		

	}

}
