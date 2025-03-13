package Fonksiyonlar;

import java.util.Scanner;

public class Fonksiyonlar03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 11 haneli TC kimlik numaranızı giriniz: ");
        String tc = scanner.nextLine();  
        
        
        if (tc.length() != 11 || !tc.matches("\\d+")) {
            System.out.println("Hatalı TC kimlik numarası girdiniz. Lütfen 11 haneli bir sayı giriniz.");
        } else {
            char sonRakam = tc.charAt(10);  
            
            switch (sonRakam) {
                case '0' :
                    System.out.println("01.01.2020");
                    break;
                case '2' :
                    System.out.println("02.01.2020");
                    break;
                case '4' :
                    System.out.println("03.03.2020");
                    break;
                case '6' :
                    System.out.println("04.01.2020");
                    break;
                case '8' :
                    System.out.println("05.01.2020");
                    break;
                default :
                    System.out.println("Bir hata oluştu, tekrar deneyiniz.");
                    break;
            }
        }
        
        scanner.close();
    }

}
