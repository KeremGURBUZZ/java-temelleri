package compositionOrnek;

public class Urun {
	
	public String isim;
	public String kategori;
	public int fiyat;
	public int urunNo;
	public int stok = 51;
	
	public Urun(String isim, String kategori, int fiyat, int urunNo, int stok) {
		super();
		this.isim = isim;
		this.kategori = kategori;
		this.fiyat = fiyat;
		this.urunNo = urunNo;
		this.stok = stok;
	}
	

}
