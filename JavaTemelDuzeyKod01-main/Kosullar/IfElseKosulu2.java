package Kosullar;

import java.util.Scanner;

public class IfElseKosulu2 {

	public static void main(String[] args) {
		// KULLANICININ YASINA GORE GENC Mİ YASLI MI OLDUĞUNU SOYLEYEN PROGRAM 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Yasınızı Giriniz :");
		
		int yas = scanner.nextInt();
		
		if(yas <= 30) {
			
			System.out.println("Hala Gencsiniz Hayatın Tadını Cıkarın :)");
			
		}else {
			
			System.out.println("Uzulmeyin Bu Dunya Bostur...Ve Maalesef Yaslısınız");
			
		}
		
        scanner.close();
		
	}

}
