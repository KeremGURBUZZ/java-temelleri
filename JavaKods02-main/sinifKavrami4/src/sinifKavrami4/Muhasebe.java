package sinifKavrami4;

public class Muhasebe {
	
	public int toplamPara = 0;
	public String ilgiliMudur = "Kerem Gürbüz";
	
	public void paraEkle(int para) 
	{
		toplamPara += para;
		System.out.println("Para başarıyla eklendi. Toplam para :" + toplamPara);
	}
	public void paraAl(int para) 
	{
		toplamPara -= para;
		System.out.println("Para alındı. Toplam para :" + toplamPara);
	}
	public void toplamParaGoster() 
	{
		System.out.println("Toplam para :" + toplamPara);
	}
	

		
	

}
