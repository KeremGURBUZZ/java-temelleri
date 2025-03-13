import java.util.Scanner;

public class Sayac {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayaç'a hoşgeldiniz.");

        int baslangicSayisi;
        int hedefSayi = 100;

        System.out.println("Başlangıç sayısını giriniz:");
        baslangicSayisi = scanner.nextInt();
        scanner.nextLine();

        if (baslangicSayisi >= hedefSayi) {
            System.out.println("Girilen sayı 100'den büyük veya eşit. Lütfen 100'den küçük bir sayı giriniz.");
        } else {
            System.out.println("Sayaç başlatılıyor. Devam etmek için Enter tuşuna basın.");
        }

        for (int i = baslangicSayisi; i <= hedefSayi; i++) {
            System.out.println("Sayaç: " + i);
            scanner.nextLine();
        }

        System.out.println("Sayaç tamamlandı!");
        scanner.close();
    }
}

