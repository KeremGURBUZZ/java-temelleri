package kalitim;

public class Kalitim01 {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci();
		Ogretmen ogretmen = new Ogretmen();	
		ogrenci.girisYap("admin", "12345");
		ogretmen.girisYap("admin", "1234567");
		ogretmen.ogrencileriListele();
		

	}

}
