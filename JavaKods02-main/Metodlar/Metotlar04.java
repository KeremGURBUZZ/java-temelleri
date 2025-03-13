package Metodlar;

public class Metotlar04 {
	
	public static double ortalamaBul(int sayi1 , int sayi2) 
	{
		int toplam = sayi1 + sayi2;
		double ortalama = toplam / 2;
		return ortalama;
		
	}

	public static void main(String[] args) {
		
		System.out.println(ortalamaBul(10, 20));
		

	}

}
