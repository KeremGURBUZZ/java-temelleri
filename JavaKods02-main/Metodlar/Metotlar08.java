package Metodlar;

public class Metotlar08 {
	
	public static void puanYazdir(String kullaniciAdi , int puan) 
	{
		System.out.println(kullaniciAdi + " İsimli kullanıcının puannı : " + puan);
	}
	public static void puanYazdir(String kullaniciAdi) 
	{
		System.out.println(kullaniciAdi + " İsimli kullanıcının puanı : 0'dır.");
	}
	public static void puanYazdir(int puan) 
	{
		System.out.println("İsimsiz kullanıcının puanı :" + puan);
	}
	public static void puanYazdir() 
	{
		System.out.println("İsimsiz kullanıcının puanı : 0'dır.");
	}

	public static void main(String[] args) {
		
		puanYazdir("Fosforat", 20);
		puanYazdir("fosforat");
        puanYazdir(50);
        puanYazdir();
		

	}

}
