package Kosullar;

import java.util.Scanner;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in , "ISO-8859-9");
		System.out.print("Coğrafi bölgenizi giriniz : ");
		String bolge = scanner.nextLine();
		
		switch(bolge) 
		{
		case "Marmara":
			System.out.println("Maramara için yatacak burs miktarı 600TL/Ay");
			break;
		case "Ege":
			System.out.println("Ege için yatacak burs miktarı 550TL/Ay");
			break;
		case "Akdeniz":
			System.out.println("Akdeniz için yatacak burs miktarı 500TL/Ay");
			break;
		case "İç Anadolu":
			System.out.println("İç Anadolu için yatacak burs miktarı 450TL/Ay");
			break;
		case "Güneydoğu Anadolu":
			System.out.println("Güneydoğu Anadolu için yatacak burs miktarı 400TL/Ay");
			break;
		case "Doğu Anadolu":
			System.out.println("Doğu Anadolu için yatacak burs miktarı 350TL/Ay");
			break;
		case "Karadeniz":
			System.out.println("Karadeniz için yatacak burs miktarı 300TL/Ay");
			
		default:
			System.out.println("Lütfen doğru bir bölge ismi giriniz\n"
					+ "Lütfen bölgelerin ismini düzgün yazdığınızdan emin olun.");
		}
		

	}

}
