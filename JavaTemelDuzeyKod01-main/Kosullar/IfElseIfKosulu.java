package Kosullar;

import java.util.Scanner;

public class IfElseIfKosulu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Harf Giriniz :");
		
		char ilkHarf = scanner.nextLine().charAt(0);
		
		if(ilkHarf == 'p' || ilkHarf == 'P') {
			
			System.out.println("Pazartesi, Persembe, Pazar");
			
		}else if(ilkHarf == 's' || ilkHarf == 'S' ) {
			
			System.out.println("Sali");
			
		}else if(ilkHarf == 'c' || ilkHarf == 'C') {
			
			System.out.println("Carsamba,Cuma,Cumartesi");
			
		}else {
			
			System.out.println("Yanlıs Girdiniz" + ilkHarf + "Baslayan Bir Gun Yok!");
			
		}
		
		scanner.close();

	}

}
