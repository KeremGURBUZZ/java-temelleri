package Kosullar;

import java.util.Scanner;

public class IfElseKosulu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hava Gunesli mi ? --> true/false");
		
		boolean havaGunesli = scanner.nextBoolean();
		
		if(havaGunesli) {
			
			System.out.println("O Halde Pikniğe Gidiyoruz..");
			
		}else {
			
			System.out.println("Maalesef Evde Film İzliyoruz..");
			
		}
		
		scanner.close();


	}

}
