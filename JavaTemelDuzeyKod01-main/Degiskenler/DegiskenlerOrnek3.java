package Degiskenler;

import java.util.Scanner;

public class DegiskenlerOrnek3 {

    public static void main(String[] args) {

        // Kullanıcıdan iki tam sayı alıp bu sayıların toplam, çarpım ve bölümünün
        // sonuçlarını kullanıcıya gösteren bir program yazın.

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki tam sayı alın
        System.out.print("Birinci sayıyı girin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int b = scanner.nextInt();

        // Toplam işlemi
        int toplam = a + b;
        System.out.println("Toplam: " + toplam);

        // Çarpım işlemi
        int carpim = a * b;
        System.out.println("Çarpım: " + carpim);

        // Bölüm işlemi 
        if (b != 0) {
            int bolum = a / b;
            System.out.println("Bölüm: " + bolum);
        } else {
            System.out.println("Bölme işlemi için ikinci sayı sıfır olamaz.");
        }

        
    }
}

