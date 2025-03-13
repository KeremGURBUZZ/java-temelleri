package Operatorler;

import java.util.Scanner;

public class OperatorlerOrnek2 {

    public static void main(String[] args) {
        
        // Yurt dışına çıkabilmek için 14 yaşını doldurmuş ve pasaportunuzun olması gerekmektedir 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen Yaşınızı Giriniz:");
        
        int yas = scanner.nextInt();
        
        if (yas < 14) {
        	
            System.out.println("Maalesef yaşınızdan dolayı çıkamazsınız :(");
            
        } else {
            System.out.println("Yaşınız tamam, pasaportunuz var mı? (Evet/Hayır)");
            
            scanner.nextLine();  
            
            String cevap = scanner.nextLine();
            
            boolean pasaportMevcut = cevap.equalsIgnoreCase("Evet");
            
            if (yas >=14 && pasaportMevcut) {
                System.out.println("Yurt dışına çıkabilirsiniz.");
            } else {
                System.out.println("Pasaportunuz olmadığı için çıkamazsınız.");
            }
        }
        
        scanner.close();  
    }
}

