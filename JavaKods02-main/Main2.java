import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Sayıyı giriniz : ");
		int sayi1 = scanner.nextInt();
		System.out.print("2. Sayıyı giriniz : ");
		int sayi2 = scanner.nextInt();
		System.out.print("3. Sayıyı giriniz : ");
		int sayi3 = scanner.nextInt();
		
		if((sayi1 & 2)==0 || (sayi2 & 2)==0 || (sayi3 & 2)==0) 
		{
			System.out.println("Tebrikler!");
		}
		else 
		{
			System.out.println("Kaybettiniz!");
		}

	}

}
