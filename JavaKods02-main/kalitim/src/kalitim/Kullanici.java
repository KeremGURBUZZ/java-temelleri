package kalitim;

public class Kullanici {
	
	public String kullaniciAdi;
	public String sifre;
	
	public void girisYap(String kullaniciAdi , String sifre) 
	{
		if(kullaniciAdi.equals("admin") && sifre.equals("123456")) 
		{
			System.out.println("Giriş başarılı.");
			
		}
		else 
		{
			System.out.println("Giriş başarısız.");
		}
	}
	
	public void mesajGonder() 
	{
		System.out.println("Mesaj gönderildi.");
	}

}
