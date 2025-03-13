package Metodlar;

import java.util.Scanner;

public class Metotlar05 {
    
    public static boolean asalKontrol(int deger) 
    {
        boolean sonuc = true;
        for(int i = 2; i < deger; i++) 
        {
            if(deger % i == 0) 
            {
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kontrol edeceğiniz sayıyı giriniz : ");
        int deger = scanner.nextInt();
        
        boolean deger1 = asalKontrol(deger);
        
        if(deger1 == true) 
        {
            System.out.println("Sayı asaldır.");
        }
        else 
        {
            System.out.println("Sayı asal değildir.");
        }
        
        scanner.close();
    }

}
