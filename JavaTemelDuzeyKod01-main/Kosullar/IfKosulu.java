package Kosullar;

import java.util.Scanner;

public class IfKosulu {

    public static void main(String[] args) {
        // KULLANICIDAN ALINAN SAYININ POZİTİF, NEGATİF VEYA NÖTR OLDUĞUNU BULAN PROGRAM

        Scanner tahmin = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz:");

        double girilenDeger = tahmin.nextDouble();

        if (girilenDeger > 0) {
            System.out.println("Sayi Pozitiftir!");
        }

        if (girilenDeger < 0) {
            System.out.println("Sayi Negatiftir!");
        }

        if (girilenDeger == 0) {
            System.out.println("Sayi Notrdur!");
        }

        tahmin.close();
    }
}

