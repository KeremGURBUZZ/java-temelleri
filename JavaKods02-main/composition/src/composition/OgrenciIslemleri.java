package composition;

public class OgrenciIslemleri {	
	
	public Ogrenci ogrenci;

	public OgrenciIslemleri(Ogrenci ogrenci) 
	{
		this.ogrenci = ogrenci;
	}
	
	public void ekle() 
	{
		System.out.println("Öğrenci eklendi :" + ogrenci.ad);
	}
	public void sil() 
	{
		System.out.println("Öğrenci silindi :" + ogrenci.no);
	}
	public void bilgileriGoster() 
	{
		System.out.println(ogrenci.ad);
		System.out.println(ogrenci.soyad);
		System.out.println(ogrenci.no);
		System.out.println(ogrenci.dogumTarihi);
		System.out.println(ogrenci.babaAdi);
		System.out.println(ogrenci.anaAdi);
	}

}
