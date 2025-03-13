package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays04 {

    public static void main(String[] args) {
        // DAHA GELİŞMİŞ VERSİYONU 1--5000 ARASINDA 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen rastgele bir sayı üretmek için bir alt sınır girin: ");
        int min = scanner.nextInt();

        System.out.print("Lütfen rastgele bir sayı üretmek için bir üst sınır girin: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        int attempts = 10;

        System.out.println("Rastgele bir sayı seçildi. Bu sayıyı tahmin etmeye çalışın!");
        System.out.println(attempts + " tahmin hakkınız var.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Lütfen bir sayı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi > randomNumber) {
                System.out.println("Lütfen daha küçük bir sayı giriniz. " + (attempts - i - 1) + " tahmin hakkınız kaldı.");
            } else if (sayi < randomNumber) {
                System.out.println("Lütfen daha büyük bir sayı giriniz. " + (attempts - i - 1) + " tahmin hakkınız kaldı.");
            } else {
                System.out.println("Tebrikler, sayıyı buldunuz! " + (i + 1) + " deneme yaptınız.");
                break;
            }

            if (i == attempts - 1) {
                System.out.println("Üzgünüm, tahmin haklarınız tükendi. Doğru sayı: " + randomNumber);
            }
        }

        scanner.close();
    }
}
