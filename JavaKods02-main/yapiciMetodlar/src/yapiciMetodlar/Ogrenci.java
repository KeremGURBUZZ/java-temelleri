package yapiciMetodlar;

public class Ogrenci {
	
	private String ad;
	private String soyad;
	private int okulNo;
	private int dogumYili;
	
	public Ogrenci() 
	{
		this.ad = "Girilmedi";
		this.soyad = "Girilmedi";
		this.okulNo = 0000;
		this.dogumYili = 2000;
	}
	
	
	public String getAd() 
	{
		return ad;
	}
	public void setAd(String ad)
	{
		this.ad = ad;
	}
	public String getSoyad() 
	{
		return soyad;
	}
	public void setSoyad(String soyad) 
	{
		this.soyad = soyad;
	}
	public int getOkulNo() 
	{
		return okulNo;
	}
	public void setOkulNo(int okulNo) 
	{
		this.okulNo = okulNo;
	}
	public int getDogumYili()
	{
		return dogumYili;
	}
	public void setDogumYili(int dogumYili)
	{
		this.dogumYili = dogumYili;
	}
	
	
	
	

}
