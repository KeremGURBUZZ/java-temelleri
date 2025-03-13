package kalitim;

public class Ogretmen extends Kullanici{
	
	public int ogretmenNo;
	public double puan;
	public int bakiye;
	
	
	public void ogrencileriListele() 
	{
		System.out.println("Öğrenciler listelendi.");
	}
	
	public void paraCek(int miktar) 
	{
		this.bakiye = this.bakiye - bakiye;
		System.out.println("Para çekildi. " + this.bakiye);
	}
	

}
