package Fonksiyonlar;

public class Fonksiyonlar01 {

	public static void main(String[] args) {
		
		String isim = "Kerem Gürbüz";
		System.out.println(isim.length()); // length bize dizinin uzunluğunu verir.
		
		String buyukIsim = isim.toUpperCase(); //toUppersCase bize metinsel ifadede ki harfleri büyütür.
		System.out.println(buyukIsim);
		
		String kucukIsim = isim.toLowerCase(); // toLowerCase metinsel ifadede ki harfleri küçültür.
		System.out.println(kucukIsim);
		
		System.out.println(isim.trim()	); // trim metodu bize fazla girilen karakterleri aza indirger.
		
		String ad = "Kerem";
		ad.concat("  ");
		String soyad = "Gürbüz";
		String tamIsim = ad.concat(soyad);
		System.out.println(tamIsim);
		

	}

}
