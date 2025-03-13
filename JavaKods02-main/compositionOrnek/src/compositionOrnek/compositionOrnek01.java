package compositionOrnek;

public class compositionOrnek01 {

	public static void main(String[] args) {
		
		Urun urun1 = new Urun("Canavar1245 DG" , "Bilgisayar" , 2400 , 123457 , 51);

		UrunYonetimi urunYonetimi = new UrunYonetimi(urun1);
		
		urunYonetimi.ekle();
		urunYonetimi.guncelle();
		urunYonetimi.sil();

	}

}
