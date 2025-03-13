package Kosullar;

import java.util.Scanner;

public class IfKosulu2 {

	public static void main(String[] args) {
		// BİR BABANIN HAFTALIK 100 TL HARÇLIK VERDİĞİ ÇOCUKLARIYLA YAPTIĞI ANLAŞMA HER GÜN 1 SAAT KİTAP OKUNACAK
        // FAZLA OKUNAN SAAT İÇİN 15 TL BONUS KAZANACAK BU HESABI YAPAN PROGRAMI BULUN
		
		//BİLİNEN BİLGİLER
		
		int haftalıkHarclık = 100;
		
		int haftalıkOkuma = 7;
		
		int bonus = 15;
		
		int gerceklesenOkumaSaati;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Haftalık Kitap Okuma Saatinizi Giriniz :");
		
	    gerceklesenOkumaSaati = scanner.nextInt();
	    
	    // İSLEM
	    
	    if(gerceklesenOkumaSaati > haftalıkOkuma) {
	    	
	    	System.out.println((gerceklesenOkumaSaati - haftalıkOkuma) * bonus + " TL Bonus Kazandınız!");

	    	
	    }
	    
	    if(gerceklesenOkumaSaati <= haftalıkOkuma) {
	    	
	    	System.out.println("Uzgunuz Bu Hafta Bonus Yok Haftaya Daha Çok Okumalısın :)");
	    	
	    }
	    
	    scanner.close();
		
		
	}

}
