package Donguler;

import java.util.Scanner;

public class Donguler06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi;
	   while(true) 
	   {
		   System.out.print("1 Sayısını gir :");
		   sayi = scanner.nextInt();
		   if(sayi == 1) 
		   {
			   break;
		   }
		   
	   }
		
	   System.out.println("Program bitti.");

	}

}
