package Kosullar;

import java.util.Scanner;

public class Kosullar06 {

	public static void main(String[] args) {
		// Giriş kontrolü yapan uygulama
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kullanıcı adı : ");
		String kullanıcıAdi = scanner.nextLine();
		System.out.print("Şifrenizi giriniz : ");
		String sifre = scanner.nextLine();
		
		if(kullanıcıAdi.equals("admin") && sifre.equals("123456")) 
		{
			System.out.println("Giriş başarılı..");
		}
		else 
		{
			System.out.println("Giriş başarısız..");
		}
	
		
		

	}

}
