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
		this.ad = ad;
	}
	public String getSoyAd()
	{
		return soyAd;
	}
	public void setSoyAd(String soyAd)
	{
		this.soyAd = soyAd;
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
	
	public void bilgileriGoster() 
	{
		System.out.println(this.ad);
		System.out.println(this.soyAd);
		System.out.println(this.okulNo);
		System.out.println(this.dogumYili);
	}
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyAd=" + soyAd + ", okulNo=" + okulNo + ", dogumYili=" + dogumYili + "]";
	}
	
	

}
