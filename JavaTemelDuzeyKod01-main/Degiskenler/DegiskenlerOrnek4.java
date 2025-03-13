package Degiskenler;

import java.util.Scanner;

public class DegiskenlerOrnek4 {

	public static void main(String[] args) {
		// kullanicidan hangi dili ogrenmek istedigini ve 
        //kac saat calismasi gerektigini sor ve asagidaki cumleyi yazdir.
		//[programlama dili] ogrenmen icin hergun [saat] saat calisip pratik yapman gerek.
        //  kendinize gore cumleyi tamamlayan program yazin.
		
		Scanner scanner = new Scanner(System.in);  
		
		System.out.println("Hangi Programlama Dilini Öğrenmek İstersiniz :");
		
		String programlamaDili = scanner.nextLine();
		
		System.out.println("Günde Kaç Saat Çalışmanız Gerekiyor :");
		
		int saat = scanner.nextInt();
		
		System.out.println(programlamaDili + " öğrenmen için her gün " + saat + " saat çalışıp pratik yapman gerek.");
		
		
		
		
		
	
		
		
	}

}
