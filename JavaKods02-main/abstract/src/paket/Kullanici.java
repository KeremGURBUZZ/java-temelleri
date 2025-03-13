package paket;

public abstract class Kullanici {
	
	public void girisYap(String kullaniciAdi , String sifre) 
	{
		if(kullaniciAdi.equals("admin") && sifre.equals("asd123")) 
		{
			System.out.println("Giriş başarılı.");
		}
		else 
		{
			System.out.println("Giriş başarısız.");
		}
	}
	abstract void kayitOl();

}
