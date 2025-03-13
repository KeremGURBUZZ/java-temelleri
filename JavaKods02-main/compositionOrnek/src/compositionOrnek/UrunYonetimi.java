package compositionOrnek;

public class UrunYonetimi {
	public Urun urun;

	public UrunYonetimi(Urun urun) 
	{
		this.urun = urun;
	}
	
	public void ekle() 
	{
		System.out.println("Ürün eklendi :" + urun.isim);
	}
	public void guncelle() 
	{
		System.out.println("Ürün güncellendi :" + urun.kategori);
	}
	public void sil() 
	{
		System.out.println("Ürün silindi :" + (urun.stok - 1));
	}

}
