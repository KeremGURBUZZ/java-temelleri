package kalitimornek;

public class Hayvan {
	
	public int id;
	public String isim;
	public int yas;
	
	
	public void suVer() 
	{
		System.out.println("Su verildi.");
	}
	
	public void asıYap() 
	{
		System.out.println("Aşı yapıldı.");
	}
	
	public void temizle() 
	{
		System.out.println("Hayvan temizlendi.");
	}
	
	public void yemekVer(String yemek) 
	{
		System.out.println("Yemek verildi " + yemek);
	}
	

}
