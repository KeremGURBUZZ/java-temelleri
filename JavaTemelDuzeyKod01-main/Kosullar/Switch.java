package Kosullar;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Lütfen Bu Gunun Sayısal Degerini Giriniz :");
		
		int gunSayisal = scanner.nextInt();
		
		switch (gunSayisal) {
		
		case 1: 
			
			System.out.println("Pazartesi");
			
			break;
			
	case 2: 
			
			System.out.println("Sali");
			
			break;
		
	case 3: 
		
		System.out.println("Carsamba");
		
		break;
		
	case 4: 
		
		System.out.println("Persembe");
		
		break;
		
	case 5: 
		
		System.out.println("Cuma");
		
		break;
		
	case 6: 
		
		System.out.println("Cumartesi");
		
		break;
		
	case 7: 
		
		System.out.println("Pazar");
		
		default:
			
			System.out.println("Girilen Sayi Degerine Ait Gun Bulunmamaktadir!");
		
		}
		
		

	}

}
