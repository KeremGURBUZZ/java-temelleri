package Donguler;

import java.util.Scanner;

public class ForDongusu2 {  
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	for(int i = 1; i < 10; i++) {
    		
    		System.out.println("Lütfen bir sayi degeri gir eger negatif olursa oyun biter.");
    		
    		int sayi = scanner.nextInt();
    		
    		if(sayi<0) {
    			
    			System.out.println("Oyun bitti negatif bir deger girdin ");
    			
    			break;
    		}
    		
    	}
    	
	
  }
    
}
