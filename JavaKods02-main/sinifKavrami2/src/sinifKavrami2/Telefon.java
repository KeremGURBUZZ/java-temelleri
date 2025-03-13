package sinifKavrami2;

public class Telefon {
	
	public String marka = "APPLE";
	public String model = "Iphone 15 pro max";
	public int uretimYili = 2023;
	public double ekranBoyutu = 5.8;
	public int batarya = 6500;

	
	public void aramaYap(int numara) 
	{
		System.out.println("Arama yapılıyor " + numara);
	}
	public void aramaKabuleEt() 
	{
		System.out.println("Arama kabul edildi.");
	}

}
