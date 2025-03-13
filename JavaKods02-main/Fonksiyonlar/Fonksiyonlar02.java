package Fonksiyonlar;

public class Fonksiyonlar02 {

	public static void main(String[] args) {
		
		String isim = "Kerem Gürbüz";
		
		System.out.println(isim.charAt(3));
		System.out.println(isim.indexOf("G"));
		
		System.out.println(isim.substring(0, 3));
		
		System.out.println(isim.contains("Kerem"));

		isim = "Çağla Öner";
	    isim = isim.replace("Öner", "Gürbüz");
	System.out.println(isim.replace("Öner", "Gürbüz"));

	}

}
