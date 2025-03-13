import java.util.Scanner;

public class Atmprojesi {

    private static double balance = 1000.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== ATM'ye Hoşgeldiniz =====");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış Yap");
            System.out.print("Lütfen bir seçenek girin: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
            }
            System.out.println(); // Boş satır ekleyerek ekranı temizler
        } while (choice != 4);

        scanner.close();
    }

    // Bakiye görüntüleme
    public static void checkBalance() {
        System.out.printf("Mevcut bakiyeniz: %.2f TL%n", balance);
    }

    // Para yatırma
    public static void depositMoney(Scanner scanner) {
        System.out.print("Yatırmak istediğiniz miktarı girin: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("Başarıyla %.2f TL yatırıldı.%n", amount);
        } else {
            System.out.println("Geçersiz miktar, lütfen geçerli bir tutar girin.");
        }
    }

    // Para çekme
    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Çekmek istediğiniz miktarı girin: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Başarıyla %.2f TL çekildi.%n", amount);
        } else if (amount > balance) {
            System.out.println("Yetersiz bakiye.");
        } else {
            System.out.println("Geçersiz miktar, lütfen geçerli bir tutar girin.");
        }
    }
}
