package kapsullemeOrnek;

public class Ogrenci {
	
	private String ad;
	private String soyAd;
	private int okulNo;
	private int dogumYili;
	
	
	public String getAd()
	{
		return ad;
	}
	public void setAd(String ad)
	{
		if(ad.isEmpty()) 
		{
			System.out.println("Lütfen öğrenci adını giriniz.");
		}
		else 
		{
			this.ad = ad;
		}
	}
	public String getSoyAd()
	{
		return soyAd;
	}
	public void setSoyAd(String soyAd)
	{
		if(ad.isEmpty()) 
		{
			System.out.println("Lütfen öğrenci adını giriniz.");
		}
		else 
		{
			this.soyAd = soyAd;
		}
		this.soyAd = soyAd;
	}
	public int getOkulNo() 
	{
		return okulNo;
	}
	public void setOkulNo(int okulNo) 
	{
		if(okulNo > 1000) 
		{
			this.okulNo = okulNo;
		}
		else 
		{
			System.out.println("Okul numarasını 1000 üzeri girin.");
		}
	}
	public int getDogumYili() 
	{
		return dogumYili;
	}
	public void setDogumYili(int dogumYili)
	{
		if(dogumYili > 1900 && dogumYili < 2020) 
		{
			this.dogumYili = dogumYili;
		}
		else 
		{
			System.out.println("Geçerli bir doğum tarihi giriniz.");
		}
	}
	
	

}
