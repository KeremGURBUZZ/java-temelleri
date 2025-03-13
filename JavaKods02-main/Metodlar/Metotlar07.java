package Metodlar;

public class Metotlar07 {
	
	public static void karesiniAl(int sayi) 
	{
		int sonuc = sayi * sayi;
		System.out.println("Sayının karesi :" + sonuc);
	}
	public static void karesiniAl(double sayi) 
	{
		double sonuc = sayi * sayi;
		System.out.println("Sayının karesi :" + sonuc);
	}

	public static void main(String[] args) {
		
		karesiniAl(4.5);
		karesiniAl(12.5);
		

	}

}
