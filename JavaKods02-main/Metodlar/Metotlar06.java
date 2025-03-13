package Metodlar;

public class Metotlar06 {
	
	public static void ortalamaYaz(int sayi1 , int sayi2) 
	{
		int toplam = sayi1 + sayi2;
		double ortalama = toplam / 2;
		System.out.println("Girilen sayıların ortalaması :" + ortalama);
	}
	
	public static void ortalamaYaz(int sayi1 , int sayi2 , int sayi3) 
	{
		int toplam = sayi1 + sayi2 + sayi3;
		double ortalama = toplam / 3;
		System.out.println("Girilen sayıların ortalaması :" + ortalama);
	}

	public static void main(String[] args) {
		
		ortalamaYaz(40,60);
		ortalamaYaz(40,60,100);
		

	}

}
