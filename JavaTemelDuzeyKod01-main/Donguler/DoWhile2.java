package Donguler;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		//TUTTUĞUMUZ RAKAMI KULLANICIDAN TAHMİN ETMESİNİ İSTEYEN PROGRAM
		
		int rakam = 5;
		
		int tutulanRakam;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Bir tahmin yürüt :");
			
		tutulanRakam = scanner.nextInt();
		
		if(tutulanRakam < rakam) {
			
			System.out.println("Tahminini biraz daha yükseltmelisin");
			
		}else if(tutulanRakam>rakam) {
			
			System.out.println("Tahminini biraz düşürmelisin");
			
		}else {
			
			System.out.println("TEBRİKLER DOĞRU TAHMİN");
			
		}
			
		}while(tutulanRakam != rakam);
		
		scanner.close();

	}

}
